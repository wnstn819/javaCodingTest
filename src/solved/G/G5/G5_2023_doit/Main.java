// 신기한 소수

package solved.G.G5.G5_2023_doit;

import java.io.*;
import java.util.*;

public class Main {

    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        n = Integer.parseInt(st.nextToken());
        DFS(2, 1);
        DFS(3, 1);
        DFS(5, 1);
        DFS(7, 1);


    }

    static void DFS(int v, int jarisu) {
        if (jarisu == n) {
            if (isPrime(v)) System.out.println(v);

            return;
        }
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (isPrime(v * 10 + i)) {
                DFS(v * 10 + i, jarisu + 1);
            }
            ;
        }

    }

    static boolean isPrime(int v) {

        for (int i = 2; i <= v / 2; i++) {
            if (v % i == 0) {
                return false;
            }
        }
        return true;
    }

}
