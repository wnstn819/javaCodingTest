package ch1_string;

import java.util.Scanner;

public class s10_1_StringZip {

    public static void main(String[] args) {
        s10_1_StringZip T = new s10_1_StringZip();
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();


        System.out.println(T.solution(n));

    }

    public String solution(String str) {
        StringBuilder result = new StringBuilder();
        char[] c = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i; j < str.length(); j++) {

                if (c[i] == c[j]) {

                    ++count;

                } else {

                    result.append(c[i]).append(count);
                    i = j - 1;
                    break;
                }
                if (j == str.length() - 1) {
                    result.append(c[i]).append(count);
                    return result.toString().replace("1", "");

                }

            }

        }

        return result.toString().replace("1", "");
    }


}
