

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 최대공약수와 최소공배수
 * https://www.acmicpc.net/problem/2609
 */

public class Q2609 {
    private static int n, m;
    private static int gcd, lcm;

    private static void solution() {
        lcm = getLcm(n, m);
        System.out.println(gcd + "\n" + lcm);
    }

    private static int getLcm(int a, int b) {
        gcd = getGcd(n, m);
        return a * b / gcd;
    }

    private static int getGcd(int a, int b) {
        while (a != b) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
