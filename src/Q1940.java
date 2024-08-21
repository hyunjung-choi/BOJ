import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 주몽
 * https://www.acmicpc.net/problem/1940
 */

public class Q1940 {

    private static int N;
    private static int M;
    private static int answer;
    private static int[] materials;

    private static void solution() throws IOException {
        Arrays.sort(materials);
        int start = 0;
        int end = N - 1;

        while (start < end && start < N && end > 0) {
            int sum = materials[start] + materials[end];

            if (sum < M) {
                start++;
            } else if (sum > M) {
                end--;
            }
            else {
                start++;
                end--;
                answer++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(answer + "\n");

        bw.flush();
        bw.close();
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        materials = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            materials[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
