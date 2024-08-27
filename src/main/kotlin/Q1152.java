

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 단어의 개수
 * https://www.acmicpc.net/problem/1152
 */

public class Q1152 {
    private static int count;

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        count = st.countTokens();
        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        System.out.println(count);
    }
}
