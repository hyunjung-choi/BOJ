import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 그룹 단어 체커
 * https://www.acmicpc.net/problem/1316
 */

public class Q1316 {
    private static int answer;
    private static String word;
    private static boolean[] check;

    private static boolean solution() {
        char previous = 0;

        for (int i = 0; i < word.length(); i++) {
            char cur = word.charAt(i);
            if (previous != cur) {
                if (!check[cur - 'a']) {
                    check[cur - 'a'] = true;
                    previous = cur;
                } else return false;
            }
        }
        return true;
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            word = br.readLine();
            check = new boolean[26];
            if (solution()) answer++;
        }

        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        System.out.println(answer);
    }
}
