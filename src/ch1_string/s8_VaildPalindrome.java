package ch1_string;

import java.util.Scanner;

public class s8_VaildPalindrome {

    public static void main(String[] args) {
        s8_VaildPalindrome T = new s8_VaildPalindrome();
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        System.out.println(T.solution(n));

    }

    public int solution(String str) {
        StringBuilder answer = new StringBuilder();
        char[] c = str.toCharArray();
        for (char t : c) {
            if (Character.isDigit(t)) {
                answer.append(t);
            }
        }

        return Integer.parseInt(answer.toString());

    }


}
