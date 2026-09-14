package Lv3;

public class mostCloseAlpahbet {
    class Solution{
        static public int[] solution(String s){
            int[] answer = new int[s.length()];
            boolean[] alpahbet = new boolean[26];

            for(int i=0; i<s.length(); i++){
                answer[i] = -1;
                if(alpahbet[s.charAt(i)-'a']==false){
                    alpahbet[s.charAt(i)-'a'] = true;
                }
                else{
                    for(int j=0; j<i; j++){
                        if(s.charAt(i)==s.charAt(j)){
                            int gap = i-j;
                            answer[i] = gap;
                        }
                    }
                }

            }
//            for(int i=0; i<s.length(); i++){
//                System.out.println(answer[i]);
//
//            }
//            System.out.println(alpahbet[1]);
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution("banana"));
    }
}
