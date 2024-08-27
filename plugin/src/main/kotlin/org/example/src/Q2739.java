package org.example.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 구구단
 */

public class Q2739 {
    private static int N;

    private static void gugudan() {
        for (int i = 1; i <= 9; i++) System.out.printf("%d * %d = %d\n", N, i, N * i);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        br.close();
    }
    public static void main(String[] args) throws Exception {
        input();
        gugudan();
    }
}
