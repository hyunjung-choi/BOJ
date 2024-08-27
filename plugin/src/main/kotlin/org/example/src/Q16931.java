package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 겉넓이 구하기
 * https://www.acmicpc.net/problem/16931
 */

public class Q16931 {

    private static int N, M;
    private static int[][] paper;
    private static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private static int answer;

    private static void solution() {
        answer += N * M * 2; // 위, 아래 넓이

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {

                for (int[] dir : dirs) {
                    int dx = i + dir[0];
                    int dy = j + dir[1];

                    if (dx < 0 || dx > N - 1 || dy < 0 || dy > M - 1) {
                        answer += paper[i][j];
                        continue;
                    }

                    if (paper[dx][dy] < paper[i][j]) {
                        answer += paper[i][j] - paper[dx][dy];
                    }
                }
            }
        }

        System.out.println(answer);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        paper = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        br.close();
    }
    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
