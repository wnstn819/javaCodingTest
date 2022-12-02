package solved.S.S5_2018_doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());

        int startIndex = 1;
        int endIndex = 1;
        int sum = 1;
        int count = 1;
        while (endIndex < m) {
            if (sum < m) {
                endIndex++;
                sum = sum + endIndex;

            } else if (sum > m) {
                sum = sum - startIndex;
                startIndex++;
            } else {
                count++;
                endIndex++;
                sum = sum + endIndex;

            }
        }
        System.out.println(count);

    }
}
