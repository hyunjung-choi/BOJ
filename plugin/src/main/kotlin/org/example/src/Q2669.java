package org.example.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 직사각형 네개의 합집합의 면적 구하기
 * https://www.acmicpc.net/problem/2669
 */

public class Q2669 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        boolean[][] map = new boolean[101][101];
        int count = 0;

        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for (int x = x1; x < x2; x++) {
                for (int y = y1; y < y2; y++) {
                    if (!map[x][y]) {
                        map[x][y] = true;
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        br.close();
    }
}
