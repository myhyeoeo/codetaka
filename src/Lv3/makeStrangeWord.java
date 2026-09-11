package Lv3;

public class makeStrangeWord {
    class Solution{
        static public String solution(String s){
            String answer = "";
            String[] arr = s.split(" ",-1);
            for(int i=0; i<arr.length; i++){

                for(int j=0; j<arr[i].length(); j++){
                    char c = arr[i].charAt(j);
                    if(j%2==0){
                        answer += Character.toUpperCase(c);
                    }
                    else{
                        answer += Character.toLowerCase(c);
                    }
                }
                if(i<arr.length-1) answer += " ";
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution("try hello world"));
    }
}
