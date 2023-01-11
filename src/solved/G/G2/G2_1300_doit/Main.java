//k번째 수

package solved.G.G2.G2_1300_doit;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());

        long start = 1, end = m;
        long ans = 0;
        //이진 탐색
        while (start <= end) {
            long middle = (start + end) / 2;
            long cnt = 0;

            // 중앙값보다 작은 수는 몇 개 인지 계산하기
            for (int i = 1; i <= n; i++) {
                cnt += Math.min(middle / i, n);
            }

            if (cnt < m) {
                start = middle + 1;

            } else {
                ans = middle;
                end = middle - 1;
            }
        }
        System.out.println(ans);

    }
}
