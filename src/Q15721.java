import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 번데기
 * https://www.acmicpc.net/problem/15721
 */

public class Q15721 {
    private static int people, T, chant;
    private static int bun = 0, daegi = 0;

    private static int solution() {
        int round = 2;

        while (true) {
            for (int i = 0; i < 4; i++) {
                if (i % 2 == 0) {
                    bun++;
                    if (bun == T && chant == 0) return (bun + daegi - 1) % people;
                } else {
                    daegi++;
                    if (bun == T && chant == 1) return (bun + daegi - 1) % people;
                }
            }

            for (int i = 0; i < round; i++) {
                bun++;
                if (bun == T && chant == 0) return (bun + daegi - 1) % people;
            }

            for (int i = 0; i < round; i++) {
                daegi++;
                if (daegi == T && chant == 1) return (bun + daegi - 1) % people;
            }

            round++;
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        people = Integer.parseInt(br.readLine());
        T = Integer.parseInt(br.readLine());
        chant = Integer.parseInt(br.readLine());
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(solution());
    }
}
