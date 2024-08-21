/**
 * 버블 소트
 * https://www.acmicpc.net/problem/1377
 */

import java.io.*;
import java.util.Arrays;

public class Q1377 {

    private static int N;
    private static Element[] A;

    private static void solution() {
        Arrays.sort(A);
        int max = 0;

        for (int i = 0; i < N; i++) {
            if (max < A[i].oldIndex - i) max = A[i].oldIndex - i;
        }
        System.out.println(max + 1);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        A = new Element[N];
        for (int i = 0; i < N; i++) A[i] = new Element(Integer.parseInt(br.readLine()), i);
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}

class Element implements Comparable<Element> {
    int value;
    int oldIndex;

    public Element(int value, int oldIndex) {
        this.value = value;
        this.oldIndex = oldIndex;
    }

    @Override
    public int compareTo(Element o) {
        return this.value - o.value;
    }
}
