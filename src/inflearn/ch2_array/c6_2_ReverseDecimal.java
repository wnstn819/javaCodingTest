package inflearn.ch2_array;

import java.util.ArrayList;
import java.util.Scanner;

public class c6_2_ReverseDecimal {
    public static void main(String[] args) {
        c6_2_ReverseDecimal T = new c6_2_ReverseDecimal();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        for (int i : T.solution(num, array)) {
            System.out.print(i + " ");
        }

    }

    public ArrayList<Integer> solution(int num, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {

                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }

            if (isPrime(res)) answer.add(res);

        }
        return answer;

    }

    public boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
