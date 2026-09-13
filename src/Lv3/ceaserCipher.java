package Lv3;

public class ceaserCipher {
    class Solution{

        static public String solution(String s, int n){
            String answer = "";
            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);

                if(c == ' ') {
                    answer += ' ';
                    continue;
                }
                if (c >= 'A' && c <= 'Z') {
                    answer += (char) ('A' + (c - 'A' + n) % 26);
                }
                // 3. 소문자인 경우
                else if (c >= 'a' && c <= 'z') {
                    answer += (char) ('a' + (c - 'a' + n) % 26);
                }
            }
//            System.out.println(answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution.solution("A B",1);
    }
}
