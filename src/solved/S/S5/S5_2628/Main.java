package solved.S.S5.S5_2628;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> wList = new LinkedList<>();
        List<Integer> hList = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        for (int testcase = 0; testcase < T; testcase++) {
            st = new StringTokenizer(br.readLine());
            if (Integer.parseInt(st.nextToken()) == 0) {
                wList.add(Integer.parseInt(st.nextToken()));
            } else {
                hList.add(Integer.parseInt(st.nextToken()));
            }


        }
        wList.add(0);
        wList.add(m);
        hList.add(0);
        hList.add(n);

        Collections.sort(wList);
        Collections.sort(hList);

        int wMax = 1;
        int hMax = 1;
        for (int i = 1; i < wList.size(); i++) {
            if (wList.get(i) - wList.get(i - 1) > wMax) {
                wMax = wList.get(i) - wList.get(i - 1);
            }
        }

        for (int i = 1; i < hList.size(); i++) {
            if (hList.get(i) - hList.get(i - 1) > hMax) {
                hMax = hList.get(i) - hList.get(i - 1);
            }

        }

        sb.append(hMax * wMax);
        System.out.println(sb);


    }
}


