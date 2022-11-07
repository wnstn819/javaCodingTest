package inflearn.ch1_string;

import java.util.Scanner;

public class s11_1_StringSecurity {

    public static void main(String[] args) {
        s11_1_StringSecurity T = new s11_1_StringSecurity();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();


        System.out.println(T.solution(n, s));

    }

    public String solution(int n, String s) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7);
            StringBuilder ctmp = new StringBuilder();

            for (char c : tmp.toCharArray()) {
                if (c == '#') {
                    ctmp.append("1");
                } else {
                    ctmp.append("0");
                }

            }
            if (i != n - 1) {
                s = s.substring(7);
            }
            result.append((char) Integer.parseInt(Integer.toHexString(Integer.parseInt(ctmp.toString(), 2)), 16));
        }
        return result.toString();


    }


}
