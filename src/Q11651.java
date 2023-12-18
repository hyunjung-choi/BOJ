import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 좌표 정렬하기 2
 * https://www.acmicpc.net/problem/11651
 */

public class Q11651 {
    private static int N;
    private static int[][] coordinate;
    private static final StringBuilder sb = new StringBuilder();

    private static void solution() {
        Arrays.sort(coordinate, ((o1, o2) -> {
            if (o1[1] == o2[1]) return o1[0] - o2[0];
            else return o1[1] - o2[1];
        }));

        for (int i = 0; i < N; i++) {
            sb.append(coordinate[i][0]).append(" ").append(coordinate[i][1]).append("\n");
        }
        System.out.println(sb);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        coordinate = new int[N][2];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            coordinate[i][0] = Integer.parseInt(st.nextToken()); // x좌표
            coordinate[i][1] = Integer.parseInt(st.nextToken()); // y좌표
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
