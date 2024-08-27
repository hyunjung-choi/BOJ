

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 평균
 * https://www.acmicpc.net/problem/1546
 */

public class Q1546 {

    private static long subjects;
    private static long maxGrade;
    private static long sum;

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        subjects = Integer.parseInt(br.readLine());
        long[] grades = new long[(int) subjects];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < subjects; i++) {
            int grade = Integer.parseInt(st.nextToken());
            grades[i] = grade;
            maxGrade = Math.max(maxGrade, grade);
            sum += grade;
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(sum * 100.0 / maxGrade / subjects);
    }
}
