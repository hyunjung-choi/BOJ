package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 영화감독 숌
 * https://www.acmicpc.net/problem/1436
 */

public class Q1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 1;
        long endNum = 666;

        while (count < n) {
            endNum++;
            if (String.valueOf(endNum).contains("666")) {
                count++;
            }
        }

        System.out.println(endNum);
    }
}
