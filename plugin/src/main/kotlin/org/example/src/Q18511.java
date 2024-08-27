package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 큰 수 구성하기
 * https://www.acmicpc.net/problem/18511
 */

public class Q18511 {
    private static int N, size, result;
    private static int[] K;

    private static void rec(int num) {
        if (N < num) return;
        if (result < num) result = num;

        for (int i = 0; i < size; i++) {
            rec((num * 10) + K[i]);
        }
    }

    private static void solution() {
        Arrays.sort(K);
        rec(0);
        System.out.println(result);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        size = Integer.parseInt(st.nextToken());

        K = new int[size];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            K[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
