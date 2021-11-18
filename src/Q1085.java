import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 직사각형에서 탈출
 * https://www.acmicpc.net/problem/1085
 */

public class Q1085 {
    private static int x, y, w, h;

    private static int solution() {
        return Math.min(Math.min(w - x, x), Math.min(h - y, y));
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        System.out.println(solution());
    }
}
