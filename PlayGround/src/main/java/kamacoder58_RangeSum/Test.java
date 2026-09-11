package kamacoder58_RangeSum;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Test {
    public static void main(String[] args) {
        new Test().testCase1();
    }

    void testCase1() {
        // One official sample containing two queries; the final query ends at EOF.
        String input = "5\n1\n2\n3\n4\n5\n0 1\n1 3";
        String expected = "3\n9\n";
        check("Official sample 1", input, expected);
    }

    private void check(String label, String input, String expected) {
        ByteArrayOutputStream captured = new ByteArrayOutputStream();
        try (PrintStream output = new PrintStream(captured, true, "UTF-8")) {
            Main.run(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)), output);
            output.flush();
            String actual = new String(captured.toByteArray(), StandardCharsets.UTF_8);
            if (normalize(expected).equals(normalize(actual))) {
                System.out.println(label + " passed");
            } else {
                System.out.println(label + " failed. Expected: " + visible(expected)
                        + ", actual: " + visible(actual));
            }
        } catch (UnsupportedOperationException e) {
            if ("Not implemented yet".equals(e.getMessage())) {
                System.out.println(label + " unfinished: implement RangeSum.sum first."
                        + " Expected output: " + visible(expected));
            } else {
                System.out.println(label + " error: " + e);
                e.printStackTrace(System.out);
            }
        } catch (Exception e) {
            System.out.println(label + " error: " + e);
            e.printStackTrace(System.out);
        }
    }

    private String normalize(String value) {
        String normalized = value.replace("\r\n", "\n");
        return normalized.endsWith("\n")
                ? normalized.substring(0, normalized.length() - 1) : normalized;
    }

    private String visible(String value) {
        return "\"" + value.replace("\r", "\\r").replace("\n", "\\n") + "\"";
    }
}
