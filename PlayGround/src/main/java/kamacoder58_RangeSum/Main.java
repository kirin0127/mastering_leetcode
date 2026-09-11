package kamacoder58_RangeSum;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

/**
 * Kamacoder 58 - 区间和 (Range Sum)
 * https://kamacoder.com/problempage.php?pid=1070
 *
 * Given an integer array, answer queries asking for the sum of the elements
 * between two zero-based indices, including both endpoints.
 *
 * Input:
 * First read n, followed by n integers (one per line in the statement).
 * Then read pairs a b until EOF; there is no query-count field.
 * Output one sum per query, on its own line.
 *
 * Official sample input:
 * 5
 * 1
 * 2
 * 3
 * 4
 * 5
 * 0 1
 * 1 3
 *
 * Official sample output:
 * 3
 * 9
 *
 * Constraints: 0 < n <= 100000; b >= a, with valid array indices.
 * Array-value bounds and query-count limits are not stated on the page.
 * This starter uses long values/results, assuming they fit in signed 64 bits.
 *
 * Implement RangeSum.sum and any preparation you need in its constructor.
 * Run Test.main in the IDE for the official sample.
 * Submit this entire file WITHOUT the package declaration. Keep the class name
 * Main, and do not submit Test.java.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        run(System.in, System.out);
    }

    static void run(InputStream input, PrintStream output) throws IOException {
        TokenReader reader = new TokenReader(input);
        String first = reader.next();
        if (first == null) {
            return;
        }

        int n = Integer.parseInt(first);
        long[] values = new long[n];
        for (int i = 0; i < n; i++) {
            values[i] = Long.parseLong(reader.requireNext());
        }

        RangeSum solver = new RangeSum(values);
        String left;
        while ((left = reader.next()) != null) {
            int a = Integer.parseInt(left);
            int b = Integer.parseInt(reader.requireNext());
            output.println(solver.sum(a, b));
        }
    }

    static class RangeSum {
        private final long[] values;
        private long[] prefix;
        private boolean isPrefixInitialize;
        RangeSum(long[] values) {
            this.values = values;
            this.prefix = new long[values.length];
            // Add any preparation your chosen approach needs here.
        }

        long sum(int a, int b) {
            if(!this.isPrefixInitialize){
                long sum = 0;
                for(int i = 0; i < values.length; i++){
                    sum += values[i];
                    this.prefix[i] = sum;
                }
                this.isPrefixInitialize = true;
            }
            if(a == 0){
                return prefix[b];
            }
            return prefix[b] - prefix[a - 1];
        }
    }

    private static class TokenReader {
        private final BufferedReader reader;
        private StringTokenizer tokens = new StringTokenizer("");

        TokenReader(InputStream input) {
            reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8));
        }

        String next() throws IOException {
            while (!tokens.hasMoreTokens()) {
                String line = reader.readLine();
                if (line == null) {
                    return null;
                }
                tokens = new StringTokenizer(line);
            }
            return tokens.nextToken();
        }

        String requireNext() throws IOException {
            String token = next();
            if (token == null) {
                throw new EOFException("Incomplete array or query pair");
            }
            return token;
        }
    }
}
