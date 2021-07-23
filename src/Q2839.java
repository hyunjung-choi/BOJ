import java.util.Scanner;

/**
 * 설탕 배달
 * https://www.acmicpc.net/problem/2839
 */

public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sugar = sc.nextInt();
        System.out.println(new Q2839().solution(sugar));
        sc.close();
//        System.out.println(new Q2839().solution(18)); // 4
//        System.out.println(new Q2839().solution(4)); // -1
//        System.out.println(new Q2839().solution(6)); // 2
//        System.out.println(new Q2839().solution(9)); // 3
//        System.out.println(new Q2839().solution(15)); // 3
//        System.out.println(new Q2839().solution(11)); // -1
    }

    private int solution(int sugar) {
        int bag = 0;

        while (sugar >= 0) {
            if (sugar % 5 == 0) {
                int n = sugar / 5;
                bag += n;
                break;
            }
            sugar -= 3;
            bag++;
        }

//        System.out.println("Sugar: " + sugar + "\tBag: " + bag);

        if(sugar < 0) return -1;
        return bag;
    }
}
