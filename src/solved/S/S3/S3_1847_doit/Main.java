package solved.S.S3.S3_1847_doit;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> list = new Stack<>();
        list.push(0);
        int n = Integer.parseInt(st.nextToken());
        int number = 1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if (list.peek() < num) {
                while (list.peek() < num) {
                    sb.append("+\n");
                    list.push(number);
                    number++;
                }
                sb.append("-\n");
                list.pop();
            } else if (list.peek() == num) {

                while (list.peek() >= num) {
                    sb.append("-\n");
                    list.pop();

                }
            } else {
                sb = new StringBuilder();
                sb.append("NO");
                break;
            }


        }

        System.out.println(sb);

    }
}
