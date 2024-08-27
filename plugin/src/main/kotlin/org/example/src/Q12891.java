package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * DNA 비밀번호
 * https://www.acmicpc.net/problem/12891
 */

public class Q12891 {
    private static int S, P, checkSecret, answer;
    private static char[] dna;
    private static final int[] checkArr = new int[4]; // 비밀번호 체크 배열 (A, C, G, T)
    private static final int[] myArr = new int[4]; // 현재 상태 배열

    private static void solution() {
        for (int i = 0; i < P; i++) {
            add(dna[i]);
        }
        if (checkSecret == 4) answer++;

        for (int i = P; i < S; i++) {
            add(dna[i]);
            remove(dna[i - P]);
            if (checkSecret == 4) answer++;
        }

        System.out.println(answer);
    }

    private static void remove(char ch) {
        switch (ch) {
            case 'A':
                if (myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;

            case 'C':
                if (myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;

            case 'G':
                if (myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;

            case 'T':
                if (myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

    private static void add(char ch) {
        switch (ch) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) checkSecret++;
                break;

            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) checkSecret++;
                break;

            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) checkSecret++;
                break;

            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) checkSecret++;
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        dna = new char[S];
        dna = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) checkSecret++;
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
