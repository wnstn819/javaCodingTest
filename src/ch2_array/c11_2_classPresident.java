package ch2_array;

import java.util.Scanner;

public class c11_2_classPresident {

    public static void main(String[] args) {
        c11_2_classPresident T = new c11_2_classPresident();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n + 1][6];

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 5; j++) {

                array[i][j] = sc.nextInt();


            }


        }


        System.out.print(T.solution(n, array));


    }

    public int solution(int n, int[][] arr) {
        System.out.println(arr.length);
        return n;

    }
}
