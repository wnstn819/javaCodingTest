package ch1_string;

import java.util.Scanner;

//내가 직접 푼 방식 피봇 형식임
public class s9_1_ShortStringDIstance {

    public static void main(String[] args) {
        s9_1_ShortStringDIstance T = new s9_1_ShortStringDIstance();
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] str = n.split(" ");

        for (int x : T.solution(str[0], str[1].charAt(0))) {
            System.out.print(x + " ");
        }

    }

    public int[] solution(String str, char s) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == s) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == s) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        return answer;
    }


}
