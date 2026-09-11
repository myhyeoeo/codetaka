package Lv2;

import java.util.Scanner;

public class watermelon {
    static class Solution{
        public String solution(int n){
            String answer = "";
            for(int i=0; i<n; i++){
                char a = ' ';
                if(i%2==0){
                    a = '수';
                }
                else{
                    a = '박';
                }
                answer = answer + a;
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.solution(n));
    }
}
