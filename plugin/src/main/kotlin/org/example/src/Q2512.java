package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 예산
 * https://www.acmicpc.net/problem/2512
 */

public class Q2512 {
    private static int n, sum, high;
    private static int[] budget;
    private static long m;

    private static int getTotal(int highBudget) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += Math.min(highBudget, budget[i]);
        }
        return total;
    }

    private static void solution() {
        if (sum <= m) {
            System.out.println(high);
            return;
        }

        int low = 1;

        while (low < high - 1) {
            int mid = (low + high) / 2;

            if (getTotal(mid) > m) {
                high = mid;
            } else {
                low = mid;
            }
        }

        System.out.println(low);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        budget = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            budget[i] = Integer.parseInt(st.nextToken());
            sum += budget[i];
            high = Math.max(high, budget[i]);
        }

        m = Long.parseLong(br.readLine());

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
