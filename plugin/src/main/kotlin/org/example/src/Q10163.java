package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 색종이
 * https://www.acmicpc.net/problem/10163
 */

public class Q10163 {
    private static int N;
    private static int[][] grid = new int[1001][1001];
    private static int[] papersCount;
    private static StringBuilder answer = new StringBuilder();

    private static void printAnswer() {
        for (int i = 1; i < N + 1; i++) {
            answer.append(papersCount[i]).append("\n");
        }
        System.out.println(answer.toString());
    }

    private static void counting() {
        papersCount = new int[N + 1];
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j < 1001; j++) {
                if (grid[i][j] != 0) papersCount[grid[i][j]] += 1;
            }
        }
    }

    private static void setPapers(int x, int y, int width, int height,int index) {
        for (int i = x; i < x + width; i++) {
            for (int j = y; j < y + height; j++) {
                grid[i][j] = index;
            }
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int width = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            setPapers(x, y, width, height, i);
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        counting();
        printAnswer();
    }
}
