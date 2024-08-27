package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 미로 탐색
 * https://www.acmicpc.net/problem/2178
 */

public class Q2178 {

    private static final int[][] directions = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    private static int N;
    private static int M;
    private static int[][] maze;
    private static int answer = 0;

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});

        while (!queue.isEmpty()) {
            int[] location = queue.poll();

            for (int[] dir : directions) {
                int dx = location[0] + dir[0];
                int dy = location[1] + dir[1];
                if (dx >= 0 && dx < N && dy >= 0 && dy < M && maze[dx][dy] == 1) {
                    maze[dx][dy] = maze[location[0]][location[1]] + 1;
                    if (dx == N - 1 && dy == M - 1) {
                        answer = maze[dx][dy];
                    }
                    queue.offer(new int[] {dx, dy});
                }
            }
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        maze = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] width = br.readLine().split("");
            for (int j = 0; j < M; j++) {
                maze[i][j] = Integer.parseInt(width[j]);
            }
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        bfs(0, 0);
        System.out.println(answer);
    }
}
