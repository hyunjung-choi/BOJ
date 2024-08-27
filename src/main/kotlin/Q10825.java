

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 국영수
 * https://www.acmicpc.net/problem/10825
 */

public class Q10825 {
    private static int N;
    private static Student[] students;
    private static StringBuilder sb = new StringBuilder();

    static class Student implements Comparable<Student> {
        String name;
        int korean, english, math;

        public Student(String name, int korean, int english, int math) {
            this.name = name;
            this.korean = korean;
            this.english = english;
            this.math = math;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", korean=" + korean +
                    ", english=" + english +
                    ", math=" + math +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            // 국어 내림차순 정렬
            if (korean != o.korean) return o.korean - korean;
            // 영어 오름차순 정렬
            if (english != o.english) return english - o.english;
            // 수학 내림차순 정렬
            if (math != o.math) return o.math - math;
            // 이름 정렬
            return name.compareTo(o.name);
        }
    }

    private static void compare() {
        Arrays.sort(students);

        for (Student std : students) {
            sb.append(std.name).append("\n");
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        students = new Student[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int kScore = Integer.parseInt(st.nextToken());
            int eScore = Integer.parseInt(st.nextToken());
            int mScore = Integer.parseInt(st.nextToken());
            students[i] = new Student(name, kScore, eScore, mScore);
        }
        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        compare();
        System.out.println(sb.toString());
    }
}

