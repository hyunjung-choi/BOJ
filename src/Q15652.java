import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N과 M (4)
 * https://www.acmicpc.net/problem/15652
 */

public class Q15652 {
    private static int N;
    private static int M;
    private static int[] selected;
    private static StringBuilder answer = new StringBuilder();

    private static void rec(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) answer.append(selected[i]).append(" ");
            answer.append("\n");
        } else {
            int start = selected[k - 1];
            if (start == 0) start = 1;
            for (int i = start; i <= N; i++) {
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
