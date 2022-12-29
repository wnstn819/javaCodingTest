//K번째 수 구하기

package solved.S.S5.S5_11004;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Main T = new Main();

        int n = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        T.quickSort(arr, 0, n - 1, K);

        System.out.println(arr[K - 1]);

    }

    public void quickSort(int[] arr, int left, int right, int K) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            if (pivot == K - 1) {
                return;
            } else if (K - 1 < pivot) {
                quickSort(arr, left, pivot - 1, K);
            } else {
                quickSort(arr, pivot + 1, right, K);
            }
        }


    }

    public int partition(int[] arr, int left, int right) {
        int M = (left + right) / 2;
        int middle = arr[left] > arr[M] ? arr[M] > arr[right] ? M : arr[left] > arr[right] ? right : left : arr[left] > arr[right] ? left : arr[right] > arr[M] ? M : right;

        if (right - left > 1) {
            swap(arr, middle, right);
        }

        int pivot = arr[right];
        int i = left, j = right - 1;
        while (i < j) {
            while (pivot < arr[j]) {
                j--;
            }
            while (i < j && pivot >= arr[i]) {
                i++;
            }
            swap(arr, i, j);


        }
        if (arr[i + 1] > arr[right]) {
            swap(arr, i + 1, right);
        }


        return i + 1;
    }

    public void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
