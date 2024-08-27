package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 애너그램 만들기
 * https://www.acmicpc.net/problem/1919
 */

public class Q1919 {
    private static String firstLine, secondLine;

    private static void solution() {

    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        firstLine = br.readLine();
        secondLine = br.readLine();



        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
    }
}
