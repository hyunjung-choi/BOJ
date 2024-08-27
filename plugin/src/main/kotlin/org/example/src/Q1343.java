package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 폴리오미노
 * https://www.acmicpc.net/problem/1343
 */

public class Q1343 {
    private static String str;

    private static void solution() {
        str = str.replaceAll("XXXX", "AAAA");
        str = str.replaceAll("XX", "BB");
        if (str.contains("X")) System.out.println(-1);
        else System.out.println(str);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}