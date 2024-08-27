package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 단지번호붙이기
 * https://www.acmicpc.net/problem/2667
 */

public class Q2667 {
    private static int n, count, complexCount;
    private static int[][] apt;
    private static final List<Integer> list = new ArrayList<>();
    private static final StringBuilder sb = new StringBuilder();
    private static final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private static void dfs(int[][] apt, int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= n || apt[i][j] != 1) {
            return;
        }

        apt[i][j] = -1;
        complexCount++;

        for (int[] dir : directions) {
            dfs(apt, i + dir[0], j + dir[1]);
        }
    }

    private static void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                complexCount = 0;
                if (apt[i][j] == 1) {
                    count++;
                    dfs(apt, i, j);
                    list.add(complexCount);
                }
            }
        }

        Collections.sort(list);
        sb.append(count).append("\n");

        for (int complex : list) {
            sb.append(complex).append("\n");
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        apt = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                apt[i][j] = str.charAt(j) - '0';
            }
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
        System.out.println(sb);
    }
}
