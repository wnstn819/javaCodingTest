package ch2_array;

import java.util.Scanner;

public class c1_1_maxNumber {
    public static void main(String[] args) {
        c1_1_maxNumber T = new c1_1_maxNumber();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.solution(arr)) {
            if (x != 0)
                System.out.print(x + " ");
        }

    }

    public int[] solution(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] <= arr[i - 1]) {
                arr[i] = 0;
            }
        }

        return arr;

    }
}
