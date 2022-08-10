package ch2_array;

import java.util.Scanner;

public class c7_1_scoreCal {
    public static void main(String[] args) {
        c7_1_scoreCal T = new c7_1_scoreCal();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print(T.solution(num, array));

    }

    public int solution(int num, int[] arr) {
        int answer = 0;
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            answer += count;
        }
        return answer;

    }
}
