package solved.S.S2_12891_doit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] checkArr = new int[4];
    static int[] myArr = new int[4];

    static int checkNum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int Result = 0;

        char[] A = new char[n];
        A = br.readLine().toCharArray();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkNum++;
            }
        }

        for (int i = 0; i < m; i++) {
            Add(A[i]);
        }

        if (checkNum == 4) {
            Result++;
        }

        for (int i = m; i < n; i++) {
            int j = i - m;
            Add(A[i]);
            remove(A[j]);
            if (checkNum == 4) {
                Result++;
            }
        }
        System.out.println(Result);

    }

    static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) {
                    checkNum++;
                }
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) {
                    checkNum++;
                }
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) {
                    checkNum++;
                }
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) {
                    checkNum++;
                }
                break;

        }
    }

    static void remove(char c) {
        switch (c) {
            case 'A':

                if (myArr[0] == checkArr[0]) {
                    checkNum--;
                }
                myArr[0]--;
                break;
            case 'C':

                if (myArr[1] == checkArr[1]) {
                    checkNum--;
                }
                myArr[1]--;
                break;
            case 'G':

                if (myArr[2] == checkArr[2]) {
                    checkNum--;
                }
                myArr[2]--;
                break;
            case 'T':

                if (myArr[3] == checkArr[3]) {
                    checkNum--;
                }
                myArr[3]--;
                break;

        }
    }
}
