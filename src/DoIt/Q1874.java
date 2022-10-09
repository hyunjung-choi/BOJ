package DoIt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 스택 수열
 * https://www.acmicpc.net/problem/1874
 */

public class Q1874 {

    private static int n; // 수열의 원소 개수
    private static int[] progression; // 수열의 현재 값
    private static Stack<Integer> stack = new Stack<>();
    private static StringBuilder sb = new StringBuilder();

    private static void solution() {
        int current = 1; // 오름차순을 하는 수의 현재 값
        boolean possible = true; // 입력된 수열을 만들 수 있는지

        for (int i = 0; i < n; i++) {
            if (progression[i] >= current) {
                while (progression[i] >= current) {
                    stack.push(current++);
                    sb.append("+").append("\n");
                }
                stack.pop();
                sb.append("-").append("\n");
            } else {
                int num = stack.pop();
                if (progression[i] < num) {
                    System.out.println("NO");
                    possible = false;
                    break;
                } else sb.append("-").append("\n");
            }
        }
        if (possible) System.out.print(sb);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        progression = new int[n];
        for (int i = 0; i < n; i++) progression[i] = Integer.parseInt(br.readLine());
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
