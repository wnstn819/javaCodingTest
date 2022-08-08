package ch2_array;

import java.util.ArrayList;
import java.util.Scanner;

public class c3_1_rockScissorPaper {
    public static void main(String[] args) {
        c3_1_rockScissorPaper T = new c3_1_rockScissorPaper();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int[] arr2 = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = sc.nextInt();
        }

        for (String x : T.solution(arr, arr2)) {
            System.out.println(x);
        }


    }

    public ArrayList<String> solution(int[] arr, int[] arr2) {
        ArrayList<String> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr2[i]) {
                answer.add("D");
            } else if (arr[i] - arr2[i] == -2 || arr[i] - arr2[i] == 1) {
                answer.add("A");
            } else {
                answer.add("B");
            }
        }

        return answer;

    }
}
