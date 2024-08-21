import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * ATM
 * https://www.acmicpc.net/problem/11399
 */

public class Q11399 {

    private static int N;
    private static ArrayList<Waiting> list = new ArrayList<>();

    private static void solution() {
        int answer = 0;
        insertionSort();
        getWaitingTime();
        for (Waiting people : list) {
            answer += people.time;
        }
        System.out.println(answer);
    }

    private static void getWaitingTime() {
        for (int i = 1; i < N; i++) {
            list.get(i).time = list.get(i - 1).time + list.get(i).time;
        }
    }

    private static void insertionSort() {
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (list.get(j).time < list.get(j - 1).time) {
                    Collections.swap(list, j, j - 1);
                } else break;
            }
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            list.add(new Waiting(i, Integer.parseInt(st.nextToken())));
        }
        br.close();
    }

    public static void main(String[] args) throws IOException {
        input();
        solution();
    }
}

class Waiting {
    int index;
    int time;

    public Waiting(int index, int time) {
        this.index = index;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Waiting{" +
                "index=" + index +
                ", time=" + time +
                '}';
    }
}
