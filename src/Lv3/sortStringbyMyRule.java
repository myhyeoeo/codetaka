package Lv3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortStringbyMyRule {
    class Solution {
        static public String[] solution(String[] strings, int n) {
            String[] answer = strings;
            char[] c = new char[strings.length];
            for(int i=0; i<strings.length; i++){
                c[i] = strings[i].charAt(n);
                answer[i] = c[i] + strings[i];
                System.out.println(answer[i]);
            }
            Arrays.sort(answer);
            for(int i=0; i<strings.length; i++){
                answer[i] = answer[i].substring(1);
                System.out.println(answer[i]);
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"sun", "bed", "car"};
        System.out.println(Solution.solution(arr,1));
    }
}
