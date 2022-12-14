package programmers.lv1.palindrome;

class Solution {
    public int solution(int n, int m) {
        int answer = 0;

        for (int i = n; i <= m; i++) {
            int num = i;
            String prev = "";
            String dev = "";
            while (num > 0) {
                int number = 0;
                number = num % 10;
                num = num / 10;

                prev = prev + number;
                dev = number + dev;

            }
            if (prev.equals(dev)) {
                answer++;
            }
        }

        return answer;
    }
}