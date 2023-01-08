import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 점프왕 쩰리 (Small)
 * https://www.acmicpc.net/problem/16173
 */

public class Q16173 {
    private static int n;
    private static int[][] map;
    private static boolean[][] visited;
    private static int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    private static String answer = "Hing";

    private static void solution() {
        if (map == null || map.length == 0 || map[0].length == 0) {
            return;
        }

        dfs(0, 0);
    }

    private static void dfs(int i, int j) {
        if (i < 0 || i >= n || j < 0 || j >= n || visited[i][j]) {
            return;
        }

        if (map[i][j] == -1) {
            answer = "HaruHaru";
            return;
        }

        visited[i][j] = true;

        for (int[] dir : dirs) {
            dfs(i + dir[0] * map[i][j], j + dir[1] * map[i][j]);
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        solution();
        System.out.println(answer);
    }
}
