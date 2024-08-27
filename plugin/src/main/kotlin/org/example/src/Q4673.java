package org.example.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 셀프 넘버
 * https://www.acmicpc.net/problem/4673
 */

public class Q4673 {
    private static List<Integer> list;
    private static StringBuilder sb = new StringBuilder();

    private static void selfNumber() {

    }

    private static void input() {
        list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97));
    }

    public static void main(String[] args) {
        input();

    }
}
