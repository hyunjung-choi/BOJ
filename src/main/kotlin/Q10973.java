

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 이전 순열
 * https://www.acmicpc.net/problem/10973
 */

public class Q10973 {
    private static int N;
    private static final List<Integer> permutation = new ArrayList<>();

    private static void solution() {
        int inversionPoint = permutation.size() - 2;

        while (inversionPoint >= 0 && permutation.get(inversionPoint) < permutation.get(inversionPoint + 1)) {
            --inversionPoint;
        }

        if (inversionPoint == -1) {
            System.out.println(-1);
            return;
        }

        for (int i = permutation.size() - 1; i > inversionPoint; --i) {
            if (permutation.get(i) < permutation.get(inversionPoint)) {
                Collections.swap(permutation, inversionPoint, i);
                break;
            }
        }

        Collections.reverse(permutation.subList(inversionPoint + 1, permutation.size()));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(permutation.get(i)).append(' ');
        }
        System.out.println(sb);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            permutation.add(Integer.parseInt(st.nextToken()));
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
