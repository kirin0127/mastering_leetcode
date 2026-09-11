package kamacoder44_LandPurchase;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.StringTokenizer;

/**
 * Kamacoder 44 - 开发商购买土地 (Land Purchase)
 * https://kamacoder.com/problempage.php?pid=1044
 *
 * An n-by-m grid represents land values. Divide the entire grid between two
 * companies using one straight horizontal or vertical cut between cells.
 * Both resulting regions must be nonempty; cells cannot be split.
 * Return the smallest absolute difference between the regions' total values.
 *
 * Input: one grid, with n and m first, then n rows of m positive integers.
 * There is no test-case count or repeated-grid loop in the stated format.
 * Output: one integer, the minimum value difference, followed by a newline.
 *
 * Official sample input:
 * 3 3
 * 1 2 3
 * 2 1 3
 * 1 2 3
 *
 * Official sample output:
 * 0
 *
 * The sample can be split after the second column into equal-value regions.
 *
 * Constraints:
 * - 1 <= n, m <= 100; n and m are not both 1.
 * - Cell values are positive integers; an upper bound is not stated.
 * - This starter uses long, assuming cell values and totals fit signed 64 bits.
 *
 * Implement minimumDifference; input/output handling is already provided.
 * Run Test.main in your IDE. For submission, copy this entire file WITHOUT the
 * package declaration, keep public class Main, and do not include Test.java.
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
        int m = Integer.parseInt(reader.requireNext());
        long[][] land = new long[n][m];
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < m; column++) {
                land[row][column] = Long.parseLong(reader.requireNext());
            }
        }
        output.println(minimumDifference(land));
    }

    static long minimumDifference(long[][] land) {
        long[] rowSum = new long[land.length];
        long[] columnSum = new long[land[0].length];
        long total = 0;
        for(int i = 0; i < land.length; i++){
            for(int j = 0; j < land[0].length; j++){
                rowSum[i] += land[i][j];
                columnSum[j] += land[i][j];
                total += land[i][j];
            }
        }
        long a = 0;
        long b = total;
        long min = Long.MAX_VALUE;
        for(int i = 0; i < land.length - 1; i++){
            a += rowSum[i];
            b -= rowSum[i];
            min = Math.min(min, Math.abs(b - a));
        }
        a = 0;
        b = total;
        for(int i = 0; i < land[0].length - 1; i++){
            a += columnSum[i];
            b -= columnSum[i];
            min = Math.min(min, Math.abs(b - a));
        }
        return min;
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
                throw new EOFException("Incomplete grid input");
            }
            return token;
        }
    }
}
