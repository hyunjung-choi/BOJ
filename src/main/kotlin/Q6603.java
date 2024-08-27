

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 로또
 * https://www.acmicpc.net/problem/6603
 */

public class Q6603 {
    private static int n;
    private static int[] s, selected;
    private static boolean[] visited;
    private static final StringBuilder answer = new StringBuilder();

    private static void rec(int k) {
        if (k == 7) {
            for (int i = 1; i <= 6; i++) answer.append(selected[i]).append(" ");
            answer.append("\n");
        } else {
            for (int i = 1; i <= n; i++) {
                if (!visited[s[i]] && (selected[k - 1] < s[i])) {
                    visited[s[i]] = true;
                    selected[k] = s[i];
                    rec(k + 1);
                    visited[s[i]] = false;
                }
            }
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());

            if (n == 0) break;

            s = new int[n + 1];
            selected = new int[7];
            visited = new boolean[50];

            for (int i = 1; i <= n; i++) s[i] = Integer.parseInt(st.nextToken());
            rec(1);
            answer.append("\n");
        }

        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        System.out.println(answer);
    }
}
