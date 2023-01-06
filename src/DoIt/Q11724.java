package DoIt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 연결 요소의 개수
 * https://www.acmicpc.net/problem/11724
 */

public class Q11724 {
    private static ArrayList<Integer>[] graph;
    private static boolean[] visited;
    private static int answer;

    private static void dfs(int v) {
        if (visited[v]) return;

        visited[v] = true;
        for (int i : graph[v]) {
            if (!visited[i]) dfs(i);
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];
        graph = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList();
        }

        for (int i = 1; i <= m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }
        answer = 0;
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(answer);
    }
}
