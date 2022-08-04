package ch1_string;

import java.util.Scanner;

class s2_UpLowerSizeCh {
    public static void main(String[] args) {
        s2_UpLowerSizeCh T = new s2_UpLowerSizeCh();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }

    public String solution(String str) {
        StringBuilder answer = new StringBuilder();

        for (char x : str.toCharArray()) {
            if (Character.isUpperCase(x)) {
                answer.append(Character.toLowerCase(x));
            } else answer.append(Character.toUpperCase(x));
        }
        return answer.toString();
    }


}