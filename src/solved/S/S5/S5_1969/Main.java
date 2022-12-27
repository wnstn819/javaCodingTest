package solved.S.S5.S5_1969;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] crr = new char[n][m];

        for (int i = 0; i < n; i++) {
            crr[i] = br.readLine().toCharArray();
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            int[] arr = new int[4];
            for (int j = 0; j < n; j++) {
                switch (crr[j][i]) {
                    case 'A':
                        arr[0]++;
                        break;
                    case 'C':
                        arr[1]++;
                        break;
                    case 'G':
                        arr[2]++;
                        break;
                    case 'T':
                        arr[3]++;
                        break;

                }
            }
            int idx = 0;
            int max = 0;
            for (int j = 0; j < 4; j++) {
                if (arr[j] > max || (arr[j] == max && j < idx)) {
                    max = arr[j];
                    idx = j;
                }
            }
            switch (idx) {
                case 0:
                    sb.append('A');
                    break;
                case 1:
                    sb.append('C');
                    break;
                case 2:
                    sb.append('G');
                    break;
                case 3:
                    sb.append('T');
                    break;
            }
            sum += n - max;

        }
        sb.append("\n" + sum);

        System.out.println(sb);


    }
}