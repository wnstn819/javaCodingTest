package ch1_string;

import java.util.Scanner;

public class s11_2_StringSecurity {

    public static void main(String[] args) {
        s11_2_StringSecurity T = new s11_2_StringSecurity();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();


        System.out.println(T.solution(n, s));

    }

    public String solution(int n, String s) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace("#", "1").replace("*", "0");
            int num = Integer.parseInt(tmp, 2);
            answer.append((char) num);

            s = s.substring(7);
        }

        return answer.toString();
    }


}
