package ch1_string;

import java.util.Scanner;

public class s9_2_ShortStringDIstance {

    public static void main(String[] args) {
        s9_2_ShortStringDIstance T = new s9_2_ShortStringDIstance();
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] str = n.split(" ");

        System.out.println(T.solution(str[0], str[1].charAt(0)));

    }

    public String solution(String str, char s) {
        int[] answer = new int[str.length()];
        char[] c = str.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int lt = 0;
            int rt = 0;
            for (int j = 0; j < str.length(); j++) {

                if (c[i - lt] == s || c[i + rt] == s) {
                    answer[i] = Math.max(lt, rt);
                    break;

                } else {
                    lt += i - lt > 0 ? 1 : 0;
                    rt += i + rt < str.length() ? 1 : 0;

                }
            }
            if (i < str.length() - 1) {
                result.append(answer[i]).append(" ");
            } else {
                result.append(answer[i]);
            }

        }


        return result.toString();
    }


}
