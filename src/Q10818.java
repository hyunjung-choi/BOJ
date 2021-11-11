import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 최소, 최대
 * https://www.acmicpc.net/problem/10818
 */

public class Q10818 {
    private static int n, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

    private static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        br.close();
    }

    public static void main(String[] args) throws Exception {
        solution();
        System.out.println(min + " " + max);
    }
}
