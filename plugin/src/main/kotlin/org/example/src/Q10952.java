package org.example.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * A + B - 5
 * https://www.acmicpc.net/problem/10952
 */

public class Q10952 {
    private static ArrayList<Integer> answer = new ArrayList<>();
    private static StringBuilder sb = new StringBuilder();

    private static void print() {
        for (int num : answer) sb.append(num).append("\n");
        System.out.println(sb.toString());
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (x == 0 && y == 0) break;
            answer.add(x + y);
        }
        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        print();
    }
}
