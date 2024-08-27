package org.example.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * OX퀴즈
 * acmicpc.net/problem/8958
 */

public class Q8958 {
    private static final StringBuilder sb = new StringBuilder();

    private static void solution(char[] chars) {
        int score = 0, sequence = 0;

        for (char ch : chars) {
            if (ch == 'O') score += ++sequence;
            else sequence = 0;
        }

        sb.append(score).append("\n");
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) solution(br.readLine().toCharArray());

        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb);
    }
}
