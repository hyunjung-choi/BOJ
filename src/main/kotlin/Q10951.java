

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * A+B - 4
 * https://www.acmicpc.net/problem/10951
 */

public class Q10951 {
    private static StringBuilder sb = new StringBuilder();

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string;

        while ((string = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(string);
            if (!st.hasMoreTokens()) break;
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }
        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb.toString());
    }
}
