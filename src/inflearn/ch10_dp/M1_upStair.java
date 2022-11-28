package inflearn.ch10_dp;


import java.io.*;
import java.util.*;

public class M1_upStair {

    static int[] dy;

    public static int Solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
            
        }


        return dy[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int m = Integer.parseInt(st.nextToken());
        dy = new int[m + 1];
        sb.append(Solution(m));

        System.out.println(sb);

    }


}
