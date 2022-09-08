package DoIt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * DNA 비밀번호
 * https://www.acmicpc.net/problem/12891
 */

public class Q12891 {
    private static int S, P, checkSecretNumber, answer;
    private static char[] dna;
    private static int[] checkArr;
    private static int[] myCheckArr;

    private static void solution() {
        for (int i = 0; i < P; i++) {
            Add(dna[i]);
        }
        if (checkSecretNumber == 4) answer++;

        for (int i = P; i < S; i++) {
            Add(dna[i]);
            Remove(dna[i - P]);
        }

        if (checkSecretNumber == 4) answer++;
        System.out.println(answer);
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myCheckArr[0] == checkArr[0]) checkSecretNumber--;
                myCheckArr[0]--;
                break;

            case 'C':
                if (myCheckArr[1] == checkArr[1]) checkSecretNumber--;
                myCheckArr[1]--;
                break;

            case 'G':
                if (myCheckArr[2] == checkArr[2]) checkSecretNumber--;
                myCheckArr[2]--;
                break;

            case 'T':
                if (myCheckArr[3] == checkArr[3]) checkSecretNumber--;
                myCheckArr[3]--;
                break;

        }
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myCheckArr[0]++;
                if (myCheckArr[0] == checkArr[0]) checkSecretNumber++;
                break;

        case 'C':
                myCheckArr[1]++;
                if (myCheckArr[1] == checkArr[1]) checkSecretNumber++;
                break;

            case 'G':
                myCheckArr[2]++;
                if (myCheckArr[2] == checkArr[2]) checkSecretNumber++;
                break;

            case 'T':
                myCheckArr[3]++;
                if (myCheckArr[3] == checkArr[3]) checkSecretNumber++;
                break;
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        dna = new char[S];
        checkArr = new int[4]; // {A, C, G, T}
        myCheckArr = new int[4];

        dna = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) checkSecretNumber++;
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
