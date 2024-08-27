

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 연산자 끼워넣기
 * https://www.acmicpc.net/problem/14888
 */

public class Q14888 {
    private static int N;
    private static int[] nums, operators;
    private static int min = Integer.MAX_VALUE;
    private static int max = Integer.MIN_VALUE;
    private static final StringBuilder sb = new StringBuilder();

    // 완성된 식에 맞게 계산해서 정답 갱신하는 함수
    private static int calculator(int operand1, int operator, int operand2) {
        if (operator == 1)
            return operand1 + operand2;
        else if (operator == 2)
            return operand1 - operand2;
        else if (operator == 3)
            return operand1 * operand2;
        else
            return operand1 / operand2;
    }

    private static void rec_func(int k, int value) {
        if (k == N) {
            min = Math.min(min, value);
            max = Math.max(max, value);
        } else {
            for (int i = 1; i <= 4; i++) {
                if (operators[i] >= 1) {
                    operators[i]--;
                    rec_func(k + 1, calculator(value, i, nums[k + 1]));
                    operators[i]++;
                }
            }
        }
    }

    private static void input() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        nums = new int[N + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++)
            nums[i] = Integer.parseInt(st.nextToken());

        operators = new int[5];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= 4; i++)
            operators[i] = Integer.parseInt(st.nextToken());

        br.close();
    }

    public static void main(String[] args) throws Exception {
        input();
        rec_func(1, nums[1]);
        sb.append(max).append("\n").append(min);
        System.out.println(sb);
    }

}
