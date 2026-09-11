package Lv2;

public class minCommonDivisor {
    class Solution{
        static public int[] solution(int n, int m){
            int[] answer = new int[2];
            int bigger = 0;
            int smaller = 0;
            if(n-m<=0) {
                bigger = m;
                smaller = n;
            }
            else {
                bigger = n;
                smaller = m;
            }
            for(int i=smaller; i>=1 ; i--){
                if(bigger%i==0 && smaller%i==0){
                    answer[0] = i;
                    break;
                }
            }
            answer[1] = bigger * smaller / answer[0];
            System.out.println(answer[0]);
            System.out.println(answer[1]);
            return answer;
        }
    }

    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        Solution.solution(n,m);
    }
}
