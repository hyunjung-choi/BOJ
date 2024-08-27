

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * DFS와 BFS
 * https://www.acmicpc.net/problem/1260
 */

public class Q1260 {
    private static int n, m, v;

    private static void bfs() {
        
    }

    private static void dfs() {

    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 정점의 개수
        m = Integer.parseInt(st.nextToken()); // 간선의 개수
        v = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점 번호




        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();

    }
}
