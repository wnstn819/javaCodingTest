package ch2_array;

import java.util.Scanner;

public class c4_1_Fibonacci {
    public static void main(String[] args) {
        c4_1_Fibonacci T = new c4_1_Fibonacci();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i : T.solution(n)) {
            System.out.print(i + " ");
        }

    }

    public int[] solution(int num) {
        int[] array = new int[num];
        array[0] = 1;
        for (int i = 1; i < num; i++) {
            if (i == 1) {
                array[i] = 1;
            } else {
                array[i] = array[i - 1] + array[i - 2];
            }


        }

        return array;

    }
}
