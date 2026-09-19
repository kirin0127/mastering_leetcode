package kamacoder55_RightRotateString;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Kamacoder 55 - 右旋字符串 (Right Rotate String)
 * https://kamacoder.com/problempage.php?pid=1065
 *
 * Rotate a string to the right by k positions: move its trailing characters
 * to the front while preserving their relative order.
 *
 * Input: two lines, first the positive integer k, then the string s.
 * There is one case, with no test-case count.
 * Output: the rotated string on one line.
 *
 * Official sample input:
 * 2
 * abcdefg
 *
 * Official sample output:
 * fgabcde
 *
 * Constraints:
 * - 1 <= k < 10000.
 * - 1 <= s.length < 10000.
 * The page does not state that k is smaller than s.length or restrict the
 * character set. Keep the string line intact; do not trim or tokenize it.
 * For k beyond the length, use the usual cyclic-rotation interpretation.
 *
 * Implement rotateRight; input/output handling is already provided.
 * Run Test.main in the IDE. Submit this entire file WITHOUT the package
 * declaration, keep public class Main, and do not include Test.java.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        run(System.in, System.out);
    }

    static void run(InputStream input, PrintStream output) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(input, StandardCharsets.UTF_8));
        String first = reader.readLine();
        if (first == null) {
            return;
        }
        int k = Integer.parseInt(first.trim());
        String s = reader.readLine();
        if (s == null) {
            throw new EOFException("Missing string line after k");
        }
        output.println(rotateRight(s, k));
    }

    static String rotateRight(String s, int k) {
        char[] arr = s.toCharArray();
        int head = 0;
        int tail = arr.length - 1;
        while(head < tail){
            char temp = arr[tail];
            arr[tail] = arr[head];
            arr[head] = temp;
            head++;
            tail--;
        }
        head = 0;
        tail = k - 1;
        while(head < tail){
            char temp = arr[tail];
            arr[tail] = arr[head];
            arr[head] = temp;
            head++;
            tail--;
        }
        head = k;
        tail = arr.length - 1;
        while(head < tail){
            char temp = arr[tail];
            arr[tail] = arr[head];
            arr[head] = temp;
            head++;
            tail--;
        }
        return new String(arr);
    }

    static String rotateRight_bruteForce(String s, int k) {
        char[] chars = new char[s.length()];
        int head = s.length() - k;
        int idx = 0;
        while(head < s.length()){
            chars[idx] = s.charAt(head);
            idx++;
            head++;
        }
        int remain = 0;
        while(idx < s.length()){
            chars[idx] = s.charAt(remain);
            idx++;
            remain++;
        }
        return new String(chars);
    }
}
