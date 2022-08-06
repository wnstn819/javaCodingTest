package ch1_string;

import java.util.Scanner;

public class s10_2_StringZip {

    public static void main(String[] args) {
        s10_2_StringZip T = new s10_2_StringZip();
        Scanner sc = new Scanner(System.in);
        String n = sc.next();


        System.out.println(T.solution(n));

    }

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();
        str = str + " ";
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) cnt++;
            else {
                answer.append(str.charAt(i));
                if (cnt > 1) answer.append(cnt);
                cnt = 1;
            }

        }
        return answer.toString();
    }


}
