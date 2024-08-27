

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 소트인사이드
 * https://www.acmicpc.net/problem/1427
 */

public class Q1427 {

    private static final ArrayList<Integer> arrayList = new ArrayList<>();
    private static final StringBuilder sb = new StringBuilder();

    private static void solution() {
        arrayList.sort((o1, o2) -> o2 - o1);
        for (int i : arrayList) sb.append(i);
        System.out.println(sb);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (char ch : br.readLine().toCharArray()) arrayList.add(ch - '0');
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
