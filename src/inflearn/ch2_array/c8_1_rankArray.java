package inflearn.ch2_array;

import java.util.ArrayList;
import java.util.Scanner;

public class c8_1_rankArray {

    public static void main(String[] args) {
        c8_1_rankArray T = new c8_1_rankArray();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();

        }

        for (int i : T.solution(n, array)) {
            System.out.print(i + " ");
        }

    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    cnt++;
                }
            }
            answer.add(cnt + 1);
        }

        return answer;

    }

}
