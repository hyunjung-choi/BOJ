

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 바이러스
 * https://www.acmicpc.net/problem/2606
 */

public class Q2606 {
    private static int N;
    private static int[][] computers;
    private static boolean[] visited;

    private static int bfs(int start) {
        int count = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (int i = 0; i < N + 1; i++) {
                if (computers[x][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int connect = sc.nextInt();
        computers = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < connect; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            computers[a][b] = 1;
            computers[b][a] = 1;
        }

        System.out.println(bfs(1));
    }
}
