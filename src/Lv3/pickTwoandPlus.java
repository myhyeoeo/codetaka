package Lv3;

import java.util.Arrays;
import java.util.HashSet;

public class pickTwoandPlus {
    class Solution{
        static public int[] solution(int[] numbers){
            HashSet<Integer> HashSet = new HashSet<>();
            for(int i=0; i<numbers.length; i++){
                for(int j=i+1; j<numbers.length; j++){
                    HashSet.add(numbers[i]+numbers[j]);
                }
            }
            int[] answer = new int[HashSet.size()];
            int count = 0;
            for(int num : HashSet){
                answer[count++] = num;
                //System.out.println(answer[count-1]);
            }
            Arrays.sort(answer);

            return answer;
        }
    }

    public static void main(String[] args) {
        int[] number = {2,1,3,4,1};
        System.out.println(Solution.solution(number));
    }
}
