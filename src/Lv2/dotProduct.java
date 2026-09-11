package Lv2;

import java.util.Scanner;

public class dotProduct {
    class Solution{
        static public int solution(int[] a, int[] b){
            int answer = 0;

            if(a.length != b.length){
                System.out.println("두 배열의 길이가 다릅니다");
                return 0;
            }

            for(int i=0; i<a.length; i++){
                answer += a[i] * b[i];
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.println(Solution.solution(arr1,arr2));
    }
}
