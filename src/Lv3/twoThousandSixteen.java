package Lv3;

public class twoThousandSixteen {
    class Solution {
        public String solution(int a, int b) {
            String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
            int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            int totalDays = 0;

            for (int i = 0; i < a - 1; i++) {
                totalDays += months[i];
            }

            totalDays += b;

            return days[totalDays % 7];
        }
    }

}
