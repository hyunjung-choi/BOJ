package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 이항 계수 1
 * https://www.acmicpc.net/problem/11050
 */

public class Q11050 {
    private static int n, k;

    private static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) result *= i;
        return result;
    }

    private static void solution() {
        System.out.println(factorial(n) / (factorial(k) * factorial(n - k)));
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
