package DoIt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * DNA 비밀번호
 * https://www.acmicpc.net/problem/12891
 */

public class Q12891 {
    private static int S, P, checkSecretNumber, left, right, answer;
    private static char[] dna;
    private static int[] checkArr;
    private static int[] myCheckArr;
    private static Map<Character, Integer> dnaMap = new HashMap<>();

    private static void solution() {

        for (int i = 0; i <= S - P; i++) {
            Map<Character, Integer> myMap = new HashMap<>();
            left = i;
            for (int j = 0; j < P; j++) {

                char ch = dna[left];
                System.out.print(ch);

                if (ch == 'A' || ch == 'C' || ch == 'G' || ch == 'T') {
                    myMap.put(ch, myMap.getOrDefault(ch, 0) + 1);
                }
                left++;

            }
            right++;
            System.out.println(myMap);
        }

        System.out.println(dnaMap);

        System.out.println(answer);
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

        dnaMap.put('A', Integer.parseInt(st.nextToken()));
        dnaMap.put('C', Integer.parseInt(st.nextToken()));
        dnaMap.put('G', Integer.parseInt(st.nextToken()));
        dnaMap.put('T', Integer.parseInt(st.nextToken()));

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}
