import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N과 M (3)
 * https://www.acmicpc.net/problem/15651
 */

public class Q15651 {
    private static int N;
    private static int M;
    private static int[] selected;
    private static StringBuilder answer = new StringBuilder();

    private static void rec(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) {
                answer.append(selected[i]).append(" ");
            }
            answer.append("\n");
        } else {
            for (int i = 1; i <= N; i++) {
                selected[k] = i;
                rec(k + 1);
            }
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        selected = new int[M + 1];
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        rec(1);
        System.out.println(answer.toString());
    }
}
