package kamacoder54_ReplaceNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Kamacoder 54 - 替换数字 (Replace Numbers)
 * https://kamacoder.com/problempage.php?pid=1064
 *
 * Replace each digit character in the input string with the literal "number".
 * Keep lowercase letters unchanged and preserve their order.
 * Each digit is replaced separately, including adjacent digits.
 *
 * Input: one string s containing only lowercase letters and digits.
 * Output: the transformed string followed by a newline.
 *
 * Official sample input:
 * a1b2c3
 *
 * Official sample output:
 * anumberbnumbercnumber
 *
 * Constraints: 1 <= s.length < 10000.
 *
 * Implement replaceNumbers; input/output handling is provided.
 * Run Test.main in the IDE. Submit this entire file WITHOUT its package
 * declaration, keep public class Main, and do not include Test.java.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        run(System.in, System.out);
    }

    static void run(InputStream input, PrintStream output) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(input, StandardCharsets.UTF_8));
        String s = reader.readLine();
        if (s == null) {
            return;
        }
        output.println(replaceNumbers(s));
    }

    static String replaceNumbers(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch - '0' < 10){
                sb.append("number");
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
