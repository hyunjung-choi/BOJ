package DoIt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 숫자의 합
 * https://www.acmicpc.net/problem/11720
 */

public class Q11720 {

    private static long answer = 0;

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String numbers = br.readLine();

        for (int i = 0; i < N; i++) answer += numbers.charAt(i) - '0';

        br.close();
    }
    public static void main(String[] args) throws IOException {
        input();
        System.out.println(answer);
    }
}
