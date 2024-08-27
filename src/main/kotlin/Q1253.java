

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 좋다
 * https://www.acmicpc.net/problem/1253
 */

public class Q1253 {

    private static int N;
    private static int answer;
    private static long[] numbers;

    private static void solution() {
        Arrays.sort(numbers);

        for (int k = 0; k < N; k++) {
            int i = 0;
            int j = N - 1;

            while (i < j) {
                if (numbers[i] + numbers[j] < numbers[k]) i++;
                else if (numbers[i] + numbers[j] > numbers[k]) j--;
                else {
                    if (i != k && j != k) {
                        answer++;
                        break;
                    }
                    else if (i == k) i++;
                    else j--;
                }
            }
        }

        System.out.println(answer);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        numbers = new long[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Long.parseLong(st.nextToken());
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
