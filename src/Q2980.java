import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 도로와 신호등
 * https://www.acmicpc.net/problem/2980
 */

public class Q2980 {

    private static int N, L, time, current;
    private static int[][] road;

    private static void solution() {
        while (current < L) {

            // 신호등이 있는 자리인 경우
            if (road[current][0] != 0) {
                int go = time % (road[current][0] + road[current][1]);

                if (go <= road[current][0])
                    time += (road[current][0] - go);
            }
            ++time;
            ++current;

            if (current == L) break;
        }
        System.out.println(time);
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 신호등의 개수
        L = Integer.parseInt(st.nextToken()); // 도로의 길이

        road = new int[101][1001];

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int index = Integer.parseInt(st.nextToken());
            road[index][0] = Integer.parseInt(st.nextToken());
            road[index][1] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        solution();
    }
}
