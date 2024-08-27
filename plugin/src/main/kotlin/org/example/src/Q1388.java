package org.example.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 바닥 장식
 * https://www.acmicpc.net/problem/1388
 */

public class Q1388 {
    private static int n, m, answer;
    private static char[][] boards;

    private static void toDown(int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || boards[i][j] != '|' || boards[i][j] == 'X') return;
        boards[i][j] = 'X';
        toDown(i + 1, j);
    }

    private static void toRight(int i, int j) {
        if (i < 0 || j < 0 || i >= n || j >= m || boards[i][j] != '-' || boards[i][j] == 'X') return;
        boards[i][j] = 'X';
        toRight(i, j + 1);
    }
    
    private static void solution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (boards[i][j] == '-') {
                    answer++;
                    toRight(i, j);
                } else if (boards[i][j] == '|') {
                    answer++;
                    toDown(i, j);
                }
            }
        }
        System.out.println(answer);
    }
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 세로
        m = Integer.parseInt(st.nextToken()); // 가로
        boards = new char[n][m];

        // 2차원 배열 입력
        for (int i = 0; i < n; i++) {
            char[] chars = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) boards[i][j] = chars[j];
        }
        br.close();
    }
    
    public static void main(String[] args) throws Exception {
        input();
        solution();
    }
}
