package Lv2;

public class divisor {
    class Solution{
        static public int solution(int left, int right){
            //left ~ right까지 모든 수 중 약수의 개수가 짝수인 수는 더하고 홀수 인 수는 뺀다
            int answer = 0;
            for(int i=left; i<=right; i++){
                int count = 0;
                for(int j = i; j>0; j--){
                    if(i%j==0){
                        count++;
                    }
                }
                if(count%2==0){
                    answer += i;
                }
                else{
                    answer -= i;
                }
            }
            return answer;
        }
    }
    public static void main(String[] args) {
        int a = 24;
        int b = 27;
        System.out.println(Solution.solution(a,b));
    }
}
