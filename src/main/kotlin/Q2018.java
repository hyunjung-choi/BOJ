

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 수들의 합 5
 * https://www.acmicpc.net/problem/2018
 */

public class Q2018 {

    private static int N, sum = 1, start = 1, end = 1, answer = 1;

    private static void solution() {
        while (end < N) {
            if (sum < N) {
                end++;
                sum += end;
            }
            else if (sum > N) {
                sum -= start;
                start++;
            } else {
                answer++;
                end++;
                sum += end;
            }
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
        System.out.println(answer);
    }
}
