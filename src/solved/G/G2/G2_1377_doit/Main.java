// 버블소트1

package solved.G.G2.G2_1377_doit;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        mData[] arr = new mData[n];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = new mData(Integer.parseInt(br.readLine()), i);
        }
        Arrays.sort(arr);
        int Max = 0;
        for (int i = 0; i < n; i++) {
            if (Max < arr[i].index - i) {
                Max = arr[i].index - i;
            }

            System.out.println(Max + 1);
        }


    }
}

class mData implements Comparable<mData> {
    int value;
    int index;

    public mData(int value, int index) {
        super();
        this.value = value;
        this.index = index;

    }

    @Override
    public int compareTo(mData o) {
        return this.value - o.value;
    }
}
