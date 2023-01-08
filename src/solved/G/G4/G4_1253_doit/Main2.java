package solved.G.G4.G4_1253_doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        int count = 0;
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            long m = arr[i];
            int sI = 0;
            int eI = n - 1;
            while (sI < eI) {

                if (arr[sI] + arr[eI] == m) {
                    if (sI != i && eI != i) {
                        count++;
                        break;
                    } else if (sI == i) {
                        sI++;
                    } else if (eI == i) {
                        eI--;
                    }


                } else if (arr[sI] + arr[eI] < m) {
                    sI++;
                } else if (arr[sI] + arr[eI] > m) {
                    eI--;
                }
            }
        }

        System.out.println(count);


    }
}
