package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 종이 자르기
 * https://www.acmicpc.net/problem/2628
 */

public class Q2628 {
    private static int W;
    private static int H;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        W = Integer.parseInt(st.nextToken()); // 10
        H = Integer.parseInt(st.nextToken()); // 8
        int N = Integer.parseInt(br.readLine()); // 3

        List<int[]> cut = new ArrayList<>(); // 자르는 점선을 담는 배열
        List<Integer> width = new ArrayList<>(); // 가로 점선 번호
        List<Integer> height = new ArrayList<>(); // 세로 점선 번호
        width.add(0); height.add(0); width.add(W); height.add(H); // 길이를 구하기 위해 0과 W,H값을 넣어줌

        // cut 배열 담기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[2];
            for (int j = 0; j < 2; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            cut.add(arr);
        }

        // width, height 배열에 점선 번호 담기
        for (int[] x : cut) {
            if (x[0] == 0) height.add(x[1]);
            if (x[0] == 1) width.add(x[1]);
        }

        Collections.sort(width);
        Collections.sort(height);

        // 각 가로길이, 세로길이를 구해서 최대 넓이를 구함
        int x, y, maxArea = Integer.MIN_VALUE;
        for (int i = 1; i < width.size(); i++) {
            x = width.get(i) - width.get(i - 1);
            for (int j = 1; j < height.size(); j++) {
                y = height.get(j) - height.get(j - 1);
                maxArea = Math.max(maxArea, x * y);
            }
        }
//        System.out.println(width);
//        System.out.println(height);
        System.out.println(maxArea);
        br.close();
    }
}
