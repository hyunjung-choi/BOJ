package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 수 이어가기
 * https://www.acmicpc.net/problem/2635
 */

public class Q2635 {
    private static int N;
    private static int longest;
    private static List<Integer> result = new ArrayList<>();
    private static List<Integer> answer = new ArrayList<>();

    private static String printAnswer(List<Integer> answer) {
        StringBuilder sb = new StringBuilder();
        for (int num : answer) sb.append(num).append(" ");
        return sb.toString();
    }

    private static void rec(int k) {
        if (result.size() < 2) {
            for (int i = 1; i <= N; i++) {
                result.add(i);
                rec(i);
            }
        } else {
            for (int i = 2; ; i++) {
                int num = result.get(i - 2) - result.get(i - 1);
                if (num >= 0) {
                    result.add(num);
                } else {
//                    System.out.println(result);
                    if (longest < result.size()) {
                        answer = List.copyOf(result);
                        longest = Math.max(longest, result.size());
                    }
                    result = new ArrayList<>();
                    result.add(N);
                    break;
                }
            }
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        result.add(N);
        rec(N);
        System.out.println(longest);
        System.out.println(printAnswer(answer));
    }
}
