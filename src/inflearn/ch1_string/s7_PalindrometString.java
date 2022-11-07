package inflearn.ch1_string;

import java.util.Scanner;

public class s7_PalindrometString {

    public static void main(String[] args) {
        s7_PalindrometString T = new s7_PalindrometString();
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        System.out.println(T.solution(n));

    }

    public String solution(String str) {
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {
            answer = "YES";
        }
        return answer;

    }


}
