// 잃어버린 괄호
package solved.S.S2.S2_1541_doit;

import java.io.*;
import java.util.*;

public class Main {
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String s = st.nextToken();
        String[] arr = s.split("-");
        result = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = calculation(arr[i]);
            if (i == 0) {
                result += temp;
            } else {
                result -= temp;
            }

        }

        System.out.println(result);

    }

    static int calculation(String a) {
        String[] plus = a.split("\\+");
        int sum = 0;
        for (int j = 0; j < plus.length; j++) {
            sum += Integer.parseInt(plus[j]);
        }
        return sum;

    }

}
