package Lv2;

public class calcLeftMoney {
    class Solution{
        static long solution(int price, int money, int count){
            //이용료 price, N번째는 이용료*N, 수중에 있는 돈 money, count번 타면 얼마 모잘라?
            long answer = -1;
            long total = 0;
            for(int i=1; i<=count; i++){
                total += price*i;
            }
            answer = (money - total) * (-1);

            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution(3,20,4));
    }
}
