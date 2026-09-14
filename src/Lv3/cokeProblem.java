package Lv3;

public class cokeProblem {
        class Solution{
            static public int solution(int a, int b, int n){
                //빈 병 a개를 가져다주면 콜라 b개를 준다. 빈병 n개 주면 콜라 몇 병을 받을 . 있을까?
                int answer = 0;
    //            int count = 0;
                while(n>=a){
                    int newCoke = (n/a)*b;
                    int remain = n%a;
                    answer += newCoke;
                    n=newCoke+remain;
    //
    //                System.out.println("answer = "+answer);
    //                System.out.println("n = "+n);
    //                count++;
                }
                return answer;
            }
        }

    public static void main(String[] args) {
        System.out.println(Solution.solution(3,1,20));//19
    }
}
