import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 구간 합 구하기 5
 * https://www.acmicpc.net/problem/11660
 */

public class Q11660 {

    private static int N; // 표의 크기
    private static int M; // 질의의 갯수
    private static int x1, y1, x2, y2, sum;
    private static int[][] matrix, sumMatrix;
    private static StringBuilder sb = new StringBuilder();

    private static void solution() {
        sum = sumMatrix[x2][y2] - sumMatrix[x1 - 1][y2] - sumMatrix[x2][y1 - 1] + sumMatrix[x1 - 1][y1 - 1];
        sb.append(sum).append("\n");
    }

    private static void getSumMatrix() {
        sumMatrix = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) sumMatrix[i][j] = sumMatrix[i - 1][j] + sumMatrix[i][j - 1] - sumMatrix[i - 1][j - 1] + matrix[i][j];
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        matrix = new int[N + 1][N + 1];

        // matrix input
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= N; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        getSumMatrix();

        for (int i = 1; i <= M; i++) {
            sum = 0;
            st = new StringTokenizer(br.readLine());

            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            solution();
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(sb.toString());
    }
}
