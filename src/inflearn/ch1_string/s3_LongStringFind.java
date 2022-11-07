package inflearn.ch1_string;

import java.util.Scanner;

public class s3_LongStringFind {
    public static void main(String[] args) {
        s3_LongStringFind T = new s3_LongStringFind();
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        System.out.println(T.solution(test));

    }

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
//        String[] s = str.split(" ");
//        for (String x : s) {
//            int len = x.length();
//            if (len > m) {
//                m = len;
//                answer = x;
//            }
//        }
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > m) answer = str;

        return answer;
    }


}
