package ch1_string;

import java.util.Scanner;

public class s6_RepeatString {

    public static void main(String[] args) {
        s6_RepeatString T = new s6_RepeatString();
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        System.out.println(T.solution(n));

    }

    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }


}
