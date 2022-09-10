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
    private static int S, P, checkSecretNumber, left, answer;
    private static char[] dna;
    private static Map<Character, Integer> dnaMap = new HashMap<>();

    private static void solution() {

        for (int i = 0; i <= S - P; i++) {
            Map<Character, Integer> myMap = new HashMap<>();
            left = i;
            checkSecretNumber = 0;
            for (int j = 0; j < P; j++) {
                char ch = dna[left];

                if (ch == 'A' || ch == 'C' || ch == 'G' || ch == 'T') {
                    myMap.put(ch, myMap.getOrDefault(ch, 0) + 1);
                }
                left++;

            }
            // System.out.println(myMap);

            for (char key : dnaMap.keySet()) {
                if (dnaMap.get(key) > 0) {
                    if (myMap.containsKey(key)) checkSecretNumber++;
                }
            }

            if (checkSecretNumber == P) answer++;
        }

        // System.out.println(dnaMap);
        System.out.println(answer);
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        dna = new char[S];
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
