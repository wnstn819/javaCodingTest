package inflearn.ch2_array;

import java.util.Scanner;

public class c11_1_classPresident {

    public static void main(String[] args) {
        c11_1_classPresident T = new c11_1_classPresident();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n + 1][6];

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < 6; j++) {

                array[i][j] = sc.nextInt();


            }


        }


        System.out.print(T.solution(n, array));


    }

    public int solution(int n, int[][] arr) {
        int[][] countArr = new int[10][6];
        int answer = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 1; i < n + 1; i++) {

            for (int j = 1; j < 6; j++) {

                countArr[arr[i][j]][j] += 1;

            }
        }

        for (int i = 1; i < 10; i++) {
            System.out.println("1");
            for (int j = 1; j < 6; j++) {
                System.out.print(countArr[i][j] + " ");
            }
        }
        System.out.println("!!!!" + countArr[0][1]);

        for (int i = 1; i < n + 1; i++) {
            int count = 0;
            for (int j = 1; j < 6; j++) {
                if (countArr[arr[i][j]][j] > 1) {
                    count++;
                }
            }
            System.out.println("count" + count);
            if (count > maxValue) {
                answer = i;
                maxValue = count;
            }
        }
        return answer;

    }
}
