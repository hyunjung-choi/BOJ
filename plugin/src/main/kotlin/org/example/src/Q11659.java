package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 구간 합 구하기 4
 * https://www.acmicpc.net/problem/11659
 */

public class Q11659 {

    private static int N, M;
    private static int[] arr;
    private static int[] sum;
    private static StringBuilder answer = new StringBuilder();

    private static int solution(int i, int j) {
        return sum[j] - sum[i - 1];
    }

    private static void getSumArray() {
        for (int i = 1; i <= N; i++) sum[i] = sum[i - 1] + arr[i];
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N + 1];
        sum = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) arr[i] = Integer.parseInt(st.nextToken());

        getSumArray();

        for (int i = 1; i < M + 1; i++) {
            st = new StringTokenizer(br.readLine());
            answer.append(solution(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))).append("\n");
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(answer.toString());
    }
}
