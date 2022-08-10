package ch2_array;

import java.util.Scanner;

public class c4_2_Fibonacci {
    public static void main(String[] args) {
        c4_2_Fibonacci T = new c4_2_Fibonacci();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        T.solution(n);


    }

    public void solution(int num) {
        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < num; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}
