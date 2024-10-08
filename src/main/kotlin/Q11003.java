

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * 최솟값 찾기
 * https://www.acmicpc.net/problem/11003
 */

public class Q11003 {

    private static class Node {
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    private static int N, L, now, i;
    private static StringBuilder sb = new StringBuilder();
    private static Deque<Node> mydeque = new LinkedList<>();

    private static void solution() {
        while (!mydeque.isEmpty() && mydeque.getLast().value > now) {
            mydeque.removeLast();
        }
        mydeque.addLast(new Node(now, i));

        if (mydeque.getFirst().index <= i - L) mydeque.removeFirst();

        sb.append(mydeque.getFirst().value).append(" ");
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        for (i = 0; i < N; i++) {
            now = Integer.parseInt(st.nextToken());
            solution();
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(sb.toString());
    }
}
