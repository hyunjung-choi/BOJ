package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 나머지 합
 * https://www.acmicpc.net/problem/10986
 */

public class Q10986 {

    private static int N, M;
    private static long answer;
    private static long[] sum, count;

    private static void solution() {
        for (int i = 0; i < M; i++) {
            if (count[i] != 0) answer += (count[i] * (count[i] - 1)) / 2;
        }
    }

    private static void dividedByM() {
        for (int i = 1; i <= N ; i++) {
            int remainder = (int) (sum[i] % M);
            if (remainder == 0) answer++;
            count[remainder]++;
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        sum = new long[N + 1];
        count = new long[1001];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            sum[i] += sum[i - 1] + Long.parseLong(st.nextToken());
        }
        dividedByM();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
        System.out.println(answer);
    }
}
