package Lv2;

public class controlString {
    class Solution{
        static public boolean solution(String s){
            boolean answer = true;
            int count = 0;
            if((s.length()==4||s.length()==6)){
                for(int i=0; i<s.length(); i++){
                    if(s.charAt(i)>='0'&& s.charAt(i)<='9'){
                        count ++;
                    }
                }
                System.out.println("count : "+count);
                if(count!=s.length()){
                    return false;
                }
                else{
                    return true;
                }
            }
            else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        String s = "123456234234";
        System.out.println(Solution.solution(s));
    }
}
