import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 극장 좌석
 * https://www.acmicpc.net/problem/2302
 */

public class Q2302 {
    private static int numberOfSeat;
    private static int numberOfVip;
    private static int[] vips;
    private static int[] dp;

    private static void solution() {
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= numberOfSeat; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        int answer = 1;
        int start = 0;
        if (numberOfVip == 0) {
            System.out.println(dp[numberOfSeat]);
            return;
        }
        for (int end : vips) {
            answer = answer * dp[end - start - 1];
            start = end;
        }
        answer = answer * dp[numberOfSeat - start];

        System.out.println(answer);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        numberOfSeat = Integer.parseInt(br.readLine());
        dp = new int[numberOfSeat + 1];
        numberOfVip = Integer.parseInt(br.readLine());
        vips = new int[numberOfVip];

        for (int i = 0; i < numberOfVip; i++) {
            int vip = Integer.parseInt(br.readLine());
            vips[i] = vip;
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
