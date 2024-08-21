import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * N과 M (5)
 * https://www.acmicpc.net/problem/15654
 */

public class Q15654 {
    private static int n, m;
    private static int[] numbers, tempList;
    private static StringBuilder sb = new StringBuilder();

    private static void backtracking() {
        if (tempList.length == m) {
            for (int temp : tempList) {
                sb.append(temp).append(" ");
            }
            sb.append("\n");
        } else {

        }
    }

    private static void solution() {
        Arrays.sort(numbers);

    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
