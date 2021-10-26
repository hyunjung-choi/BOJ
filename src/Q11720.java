import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 숫자의 합
 * https://www.acmicpc.net/problem/11720
 */

public class Q11720 {
    private static int answer;

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        for (int i = 0; i < n; i++) answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        System.out.println(answer);
    }
}
