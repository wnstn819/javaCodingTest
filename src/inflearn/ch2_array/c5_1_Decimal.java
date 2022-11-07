package inflearn.ch2_array;

import java.util.Scanner;

public class c5_1_Decimal {
    public static void main(String[] args) {
        c5_1_Decimal T = new c5_1_Decimal();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        System.out.print(T.solution(n));

    }

    public int solution(int num) {
        int answer = 0;
        int[] array = new int[num + 1];

        for (int i = 2; i < num; i++) {
            if (array[i] == 0) {
                answer++;
                for (int j = i; j <= num; j = j + i) array[j] = 1;
            }
        }

        return answer;

    }
}
