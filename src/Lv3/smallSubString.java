package Lv3;

public class smallSubString {
    class Solution{
        static public int solution(String t, String p){
            int answer = 0;
            for(int i=0; i<t.length()-p.length()+1; i++){
//                System.out.println(t.substring(i,i+p.length()));
                long a = Long.parseLong(t.substring(i,i+p.length()));
                long b = Long.parseLong(p);
                if(a<=b){
                    answer++;
                }

            }
//            System.out.println(answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution.solution("500220839878","7");
    }
}
