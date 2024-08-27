package org.example.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 달팽이는 올라가고 싶다
 * https://www.acmicpc.net/problem/2869
 */

public class Q2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int wood = Integer.parseInt(st.nextToken());

        int perDay = up - down;
        int tempWood = wood - up;
        int day = tempWood / perDay;
        int height = perDay * day;
        if (height + up < wood) day++;

        System.out.println(day + 1);
    }

//    public static void kotlin.kotlin.kotlin.kotlin.main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int up = Integer.parseInt(st.nextToken());
//        int down = Integer.parseInt(st.nextToken());
//        int wood = Integer.parseInt(st.nextToken());
//        System.out.println(new Q2869().solution(up, down, wood));
//
//        System.out.println(new Q2869().solution(2, 1, 5)); // 4
//        System.out.println(new Q2869().solution(5, 1, 6)); // 2
//        System.out.println(new Q2869().solution(5, 2, 17)); // 5
//        System.out.println(new Q2869().solution(5, 2, 18)); // 6
//        System.out.println(new Q2869().solution(5, 2, 19)); // 6
//        System.out.println(new Q2869().solution(5, 2, 20)); // 6
//        System.out.println(new Q2869().solution(5, 1, 18)); // 5
//        System.out.println(new Q2869().solution(100, 99, 1000000000)); // 999999901
//    }
//
//    private int solution(int up, int down, int wood) {
//        int perDay = up - down;
//        int tempWood = wood - up;
//        int day = tempWood / perDay;
//        int height = perDay * day;
//        if (height + up < wood) day++;
//
//        return day + 1;
//    }
}
