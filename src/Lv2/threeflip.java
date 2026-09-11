package Lv2;

public class threeflip {
    class Solution{
        static public int solution(int n){
            int answer = 0;
            String s = "";
            while(n>0){
                s = s + (n%3);
                n /= 3;
            }
            int count = 1;
            String a ="";
            //System.out.println(s);
            for(int i=s.length()-1; i>=0; i--){
                //System.out.println((s.charAt(i) -'0')*count );
                answer += ((s.charAt(i)-'0')*count);
                count*=3;
            }
            System.out.println(answer);
            return answer;
        }
    }
    public static void main(String[] args) {
        Solution.solution(125);
    }
}
