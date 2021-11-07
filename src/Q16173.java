import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 점프왕 쩰리 (Small)
 * https://www.acmicpc.net/problem/16173
 */

public class Q16173 {
    private static int n;
    private static int[][] map;
    private static final int[][] dirs = new int[][] {{1, 0}, {0, 1}};

    private static String bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{1, 1, map[1][1]}); // 현재 좌표와 그 좌표의 값을 저장
        map[1][1] = 0; // visited

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int[] dir : dirs) {
                int dx = cur[0] + dir[0] * cur[2];
                int dy = cur[1] + dir[1] * cur[2];

                if (dx > 0 && dy > 0 && dx <= n && dy <= n && map[dx][dy] != 0) {
                    if (map[dx][dy] == -1) return "HaruHaru";
                    queue.offer(new int[]{dx, dy, map[dx][dy]});
                    map[dx][dy] = 0; // visited
                }
            }
        }
        return "Hing";
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n + 1][n + 1];

        // 2차원 배열 입력
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) map[i][j] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        System.out.println(bfs());
    }
}
