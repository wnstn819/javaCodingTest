package solved.B.B_2605;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    static void temp(int[] arr, int i, int num) {

        for (int k = i; k > i - num; k--) {
            int temp = arr[k - 1];
            arr[k - 1] = arr[k];
            arr[k] = temp;
        }


    }


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            temp(arr, i, num);
        }

        for (int i = 0; i < n; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb);


    }
}


