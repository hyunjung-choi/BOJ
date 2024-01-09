import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 나무 자르기
 * https://www.acmicpc.net/problem/2805
 */

public class Q2805 {
    private static int numberOfTrees;
    private static long height;
    private static long[] trees;

    private static void solution() {
        Arrays.sort(trees);

        long low = 0;
        long high = trees[numberOfTrees - 1];

        while (low < high) {
            long mid = (low + high) / 2;
            long sum = 0;

            for (long tree : trees) {
                if (tree - mid > 0) {
                    sum += (tree - mid);
                }
            }

            if (sum < height) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(low - 1);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        numberOfTrees = Integer.parseInt(st.nextToken());
        height = Long.parseLong(st.nextToken());
        trees = new long[numberOfTrees];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numberOfTrees; i++) {
            trees[i] = Long.parseLong(st.nextToken());
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}