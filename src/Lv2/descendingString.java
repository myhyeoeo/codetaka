package Lv2;

public class descendingString {
    class Solution{
        static public String solution(String s) {
            //구현된 함수를 이용하지말자
            String answer = "";
            char[] arr = s.toCharArray();

            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] < arr[j]) {
                        char tmp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tmp;
                    }
                }
                answer += arr[i];
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        String s = "abcdefgABCD";
        System.out.println(Solution.solution(s));
    }
}
