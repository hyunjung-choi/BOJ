import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * N과 M (1)
 * https://www.acmicpc.net/problem/15649
 */

public class Q15649 {
    private static int n, m;
    private static int[] selected;
    private static boolean[] visited;
    private static final StringBuilder answer = new StringBuilder();

    private static void rec(int k) {
        if (k == m + 1) {
            for (int i = 1; i <= m; i++) answer.append(selected[i]).append(" ");
            answer.append("\n");
        } else {
            for (int i = 1; i <= n ; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    selected[k] = i;
                    rec(k + 1);
                    visited[i] = false;
                }
            }
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        selected = new int[m + 1];
        visited = new boolean[n + 1];
        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        rec(1);
        System.out.println(answer);
    }
}
