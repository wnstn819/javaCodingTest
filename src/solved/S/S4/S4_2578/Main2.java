package solved.S.S4.S4_2578;/////////////////////////////////////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    static int[][] arr = new int[5][5];
    static int count = 0, result = 0;


    public static void Sol(int x, int y, int type, int type2) {


        if (x >= 0 && y >= 0 && x < 5 && y < 5 && arr[x][y] == -1) {
            count++;
            switch (type) {
                case 1:
                    if (type2 == 1) {
                        Sol(x, y - 1, 1, 1);
                    } else {
                        Sol(x, y + 1, 1, 2);
                    }


                    break;
                case 2:
                    if (type2 == 1) {
                        Sol(x - 1, y, 2, 1);
                    } else {
                        Sol(x + 1, y, 2, 2);
                    }
                    break;
                case 3:
                    if (type2 == 1) {
                        Sol(x + 1, y - 1, 3, 1);
                    } else {
                        Sol(x - 1, y + 1, 3, 2);
                    }
                    break;
                case 4:
                    if (type2 == 1) {

                        Sol(x - 1, y - 1, 4, 1);
                    } else {
                        Sol(x + 1, y + 1, 4, 2);
                    }
                    break;

            }
        }

    }


    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();


        int[][] Narr = new int[26][2];
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                Narr[arr[i][j]][0] = i;
                Narr[arr[i][j]][1] = j;
            }
        }
        int test = 0;
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[Narr[num][0]][Narr[num][1]] = -1;
                Sol(Narr[num][0], Narr[num][1], 1, 1);//???
                Sol(Narr[num][0], Narr[num][1], 1, 2);//???

                if (count == 6) {
                    result++;
                }
                count = 0;
                Sol(Narr[num][0], Narr[num][1], 2, 1);//???
                Sol(Narr[num][0], Narr[num][1], 2, 2);//???
                if (count == 6) {
                    result++;
                }
                count = 0;
                Sol(Narr[num][0], Narr[num][1], 3, 1);//???
                Sol(Narr[num][0], Narr[num][1], 3, 2);//???

                if (count == 6) {
                    result++;
                }
                count = 0;
                Sol(Narr[num][0], Narr[num][1], 4, 1);//???
                Sol(Narr[num][0], Narr[num][1], 4, 2);//???

                if (count == 6) {
                    result++;
                }
                count = 0;


                if (result == 3) {
                    System.out.println(" i: " + (i) + " j: " + (j));
                    System.out.println("test : " + test);
                    sb.append((i + 1) * (j + 1));
                    break;
                }
                result = 0;

                //???
                //?????????
            }
            if (result == 3) {
                break;
            }

        }


        System.out.println(sb);


    }
}


