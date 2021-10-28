import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 1
 * https://www.acmicpc.net/problem/2438
 */

public class Q2438 {
    private static int n;
    private static StringBuilder sb = new StringBuilder();

    private static void star() {
        for (int i = 1; i <= n; i++) {
            sb.append("*".repeat(Math.max(0, i)));
            sb.append("\n");
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        star();
        System.out.println(sb.toString());
    }
}
