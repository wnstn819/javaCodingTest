package ch1_string;

import java.util.Scanner;

public class s5_StringReverseTo {

    public static void main(String[] args) {
        s5_StringReverseTo T = new s5_StringReverseTo();
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        System.out.println(T.solution(n));

    }

    public String solution(String str) {
        String answer;

        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic((s[lt]))) {
                lt++;

            } else if (!Character.isAlphabetic((s[rt]))) {

                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }


        }


        answer = String.valueOf(s);


        return answer;
    }


}
