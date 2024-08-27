package org.example.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/** 잃어버린 괄호
 * https://www.acmicpc.net/problem/1541
 */

public class Q1541 {
    
    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] subtract = br.readLine().split("");
        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();

    }
}
