package org.example.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 최댓값
 * https://www.acmicpc.net/problem/2562
 */

public class Q2562 {
    private static int max = Integer.MIN_VALUE;
    private static int maxIndex = 0;
    private static StringBuilder sb = new StringBuilder();

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i <= 9 ; i++) {
            int num = Integer.parseInt(br.readLine());
            if (max < num) {
                max = num;
                maxIndex = i;
            }
        }
        sb.append(max).append("\n").append(maxIndex);
        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb.toString());
    }
}
