

import java.util.Scanner;

/**
 * 방 배정
 * https://www.acmicpc.net/problem/13300
 */

public class Q13300 {
    private static int studentsNum;
    private static int K;
    private static int[] female = new int[7];
    private static int[] male = new int[7];
    private static int rooms;

    private static void countRooms() {
        // 남학생 방의 수
        for (int i = 1; i <= 6; i++) {
            if (male[i] > K) {
                if (male[i] % K == 0) rooms += male[i] / K;
                else rooms += male[i] / K + 1;
            }
            else if (male[i] > 0) rooms += 1;
        }

        // 여학생 방의 수
        for (int i = 1; i <= 6; i++) {
            if (female[i] > K) {
                if (female[i] % K == 0) rooms += female[i] / K;
                else rooms += female[i] / K + 1;
            }
            else if (female[i] > 0) rooms += 1;
        }
    }

    private static void input() {
        Scanner sc = new Scanner(System.in);
        studentsNum = sc.nextInt();
        K = sc.nextInt();
        for (int i = 0; i < studentsNum; i++) {
            int s = sc.nextInt();
            int grade = sc.nextInt();
            if (s == 1) {
                male[grade] += 1;
            } else {
                female[grade] += 1;
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        input();
        countRooms();
        System.out.println(rooms);
    }
}
