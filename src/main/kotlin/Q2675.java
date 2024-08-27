

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 문자열 반복
 * https://www.acmicpc.net/problem/2675
 */

public class Q2675 {
    private static int n, r;
    private static String s;
    private static StringBuilder sb = new StringBuilder();

    private static void solution() {
        char[] chars = s.toCharArray();
        for (char ch : chars) sb.append(String.valueOf(ch).repeat(Math.max(0, r)));
        sb.append("\n");
    }

    private static void input() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            r = Integer.parseInt(st.nextToken());
            s = st.nextToken();
            solution();
        }

        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb.toString());
    }
}
