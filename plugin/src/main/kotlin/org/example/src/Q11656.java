package org.example.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * 접미사 배열
 * https://www.acmicpc.net/problem/11656
 */

public class Q11656 {
    private static String s;
    private static int n;
    private static ArrayList<String> arrayList = new ArrayList<>();
    private static StringBuilder sb = new StringBuilder();

    private static void solution() {
        for (int i = 0; i < n; i++) arrayList.add(s.substring(i, n));
        arrayList.sort(Comparator.naturalOrder());
        for (String str : arrayList) sb.append(str).append("\n");
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        n = s.length();
        solution();
        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        System.out.println(sb.toString());
    }
}
