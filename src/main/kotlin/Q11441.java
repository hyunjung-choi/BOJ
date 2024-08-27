

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 합 구하기
 * https://www.acmicpc.net/problem/11441
 */

public class Q11441 {
    private static int n;
    private static int[] arr;
    private static final StringBuilder sb = new StringBuilder();

    private static void solution(int start, int end) {
        sb.append(arr[end] - arr[start - 1]).append("\n");
    }

    private static void getSum() {
        for (int i = 1; i <= n; i++) {
            arr[i] += arr[i - 1];
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        getSum();

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            solution(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(sb);
    }
}
