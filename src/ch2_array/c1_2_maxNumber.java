package ch2_array;

import java.util.ArrayList;
import java.util.Scanner;

public class c1_2_maxNumber {
    public static void main(String[] args) {
        c1_2_maxNumber T = new c1_2_maxNumber();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.solution(num, arr)) {
            if (x != 0)
                System.out.print(x + " ");
        }

    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) answer.add(arr[i]);
        }

        return answer;

    }
}
