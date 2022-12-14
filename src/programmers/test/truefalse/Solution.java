package programmers.test.truefalse;

import java.io.*;

class Solution {
    public static boolean solution(int[] arr) {
        boolean answer = true;

        int[] check = new int[arr.length + 1];

        for (int x : arr) {
            if (x > arr.length) {
                return false;
            }
            if (check[x] == 0) {
                check[x] = 1;

            }

        }
        for (int i = 1; i <= arr.length; i++) {
            if (check[i] != 1) {
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) throws IOException {

        int[] arr = {4, 1, 3};
        System.out.println(solution(arr));
    }
}