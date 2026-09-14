package Lv3;

import java.util.Arrays;

public class sortKthNum {
    class Solution{
        static public int[] solution(int[] array, int[][] commands){
            int[] answer = new int[commands.length];
            for(int i=0; i<commands.length; i++){
                int start = commands[i][0]-1;
                int end = commands[i][1];
                int N = commands[i][2]-1;

                int[] needsort = new int[end-start];
                int count = 0;

                for(int j=start; j<end; j++){
                    needsort[count++] = array[j];
                }
                Arrays.sort(needsort);
                answer[i] = needsort[N];
//                System.out.println(answer[i]);
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        System.out.println(Solution.solution(arr,commands));
    }
}
