package org.example.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 음계
 * https://www.acmicpc.net/problem/2920
 */

public class Q2920 {
    private static String solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] scale = new int[8];
        scale[0] = Integer.parseInt(st.nextToken());
        scale[1] = Integer.parseInt(st.nextToken());
        int diff = scale[1] - scale[0];

        for (int i = 2; i < 8; i++) {
            scale[i] = Integer.parseInt(st.nextToken());
            if (diff == 1) {
                diff = scale[i] - scale[i - 1];
                if (diff != 1) return "mixed";
            } else if (diff == -1) {
                diff = scale[i] - scale[i - 1];
                if (diff != -1) return "mixed";
            } else return "mixed";
        }
        br.close();
        if (diff == 1) return "ascending";
        else return "descending";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(solution());
    }
}
