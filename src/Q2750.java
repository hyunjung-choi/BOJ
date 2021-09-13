import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 수 정렬하기
 * https://www.acmicpc.net/problem/2750
 */

public class Q2750 {
    private static int N;
    private static int[] arr;
    private static StringBuilder sb = new StringBuilder();

    private static void sorting() {
        Arrays.sort(arr);
        for (int n : arr) sb.append(n).append("\n");
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(br.readLine());

        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        sorting();
        System.out.println(sb.toString());
    }
}
