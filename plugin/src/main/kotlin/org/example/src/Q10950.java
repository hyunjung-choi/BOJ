package org.example.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * A + B - 3
 * https://www.acmicpc.net/problem/10950
 */

public class Q10950 {
    private static int[] arr;

    private static void printArr() {
        for (int num : arr) System.out.println(num);
    }

    private static int add(int x, int y) {
        return x + y;
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = add(x, y);
        }

        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        printArr();
    }
}
