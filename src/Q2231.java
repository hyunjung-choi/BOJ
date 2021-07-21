import java.util.Scanner;

/**
 * 분해합
 * https://www.acmicpc.net/problem/2231
 */

public class Q2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(new Q2231().solution(num));
        sc.close();
    }

    private int solution(int num) {
        int result = 0;

        for (int i = 0; i < num; i++) {
            if(i + digitSum(i) == num) {
                result = i;
                break;
            }
        }

        return result;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
