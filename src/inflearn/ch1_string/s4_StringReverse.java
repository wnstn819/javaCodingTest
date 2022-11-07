package inflearn.ch1_string;

import java.util.ArrayList;
import java.util.Scanner;

public class s4_StringReverse {

    public static void main(String[] args) {
        s4_StringReverse T = new s4_StringReverse();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();

        }

        for (String x : T.solution(str)) {
            System.out.println(x);
        }

    }

    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }


}
