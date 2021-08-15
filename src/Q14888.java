import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 연산자 끼워넣기
 * https://www.acmicpc.net/problem/14888
 */

public class Q14888 {

    private static int N;
    private static int[] arr;
    private static int[] operator;
    private static int min = Integer.MAX_VALUE;
    private static int max = Integer.MIN_VALUE;

    private static void dfs(int num, int index) {
        if (index == N) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;
                if (i == 0) dfs(num + arr[index], index + 1);
                else if (i == 1) dfs(num - arr[index], index + 1);
                else if (i == 2) dfs(num * arr[index], index + 1);
                else if (i == 3) dfs(num / arr[index], index + 1);
                operator[i]++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        operator = new int[4];

        // 피연산자 배열
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 연산자 배열
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(arr[0], 1);
        System.out.println(max);
        System.out.println(min);

        br.close();
    }
}
