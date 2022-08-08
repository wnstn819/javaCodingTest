package ch2_array;

import java.util.Scanner;

public class c2_1_tallerStudent {
    public static void main(String[] args) {
        c2_1_tallerStudent T = new c2_1_tallerStudent();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(arr));


    }

    public int solution(int[] arr) {
        int cnt = 1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                cnt++;
                max = arr[i];
            }
        }

        return cnt;

    }
}
