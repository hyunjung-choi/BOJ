

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 섬의 개수
 * https://www.acmicpc.net/problem/4963
 */

public class Q4963 {
    private static int w, h, island;
    private static int[][] sea;
    private static int[][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
    private static StringBuilder sb = new StringBuilder();

    private static void dfs(int i, int j) {
        if (i < 0 || j < 0 || i >= h || j >= w || sea[i][j] != 1) return;

        sea[i][j] = -1;
        for (int[] dir : dirs) {
            dfs(i + dir[0], j + dir[1]);
        }
    }

    private static void solution() {
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (sea[i][j] == 1) {
                    island++;
                    dfs(i, j);
                }
            }
        }
        sb.append(island).append("\n");
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());
            if (w == 0 || h == 0) break;
            island = 0;
            sea = new int[h][w];

            // 이차원 배열 입력 받기
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    sea[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            solution();
        }
        br.close();
    }

    public static void main(String[] args) throws Exception{
        input();
        System.out.println(sb.toString());
    }
}
