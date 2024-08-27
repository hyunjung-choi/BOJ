package org.example.src;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 오큰수
 * https://www.acmicpc.net/problem/17298
 */

public class Q17298 {

    private static int n;
    private static int[] numbers, answer;

    private static void solution() throws IOException {
        Stack<Integer> stack = new Stack<>();

        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) answer[stack.pop()] = numbers[i];
            stack.push(i);
        }

        while (!stack.isEmpty()) answer[stack.pop()] = -1;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int nge : answer) bw.write(nge + " ");
        bw.flush();
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        numbers = new int[n];
        answer = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) numbers[i] = Integer.parseInt(st.nextToken());

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
