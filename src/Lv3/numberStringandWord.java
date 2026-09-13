package Lv3;

public class numberStringandWord {
    class Solution{
        static public int solution(String s){
            int answer = 0;
            int count = 0;
            String a = "";
            while (count<s.length()){
                switch (s.charAt(count)){
                    case 'z': // zero
                        a += "0";
                        count += 4;
                        break;
                    case 'o': // one
                        a += "1";
                        count += 3;
                        break;
                    case 't': // two three
                        if(s.charAt(count+1)=='w'){
                            a+="2";
                            count += 3;
                        }
                        else{
                            a+="3";
                            count += 5;
                        }
                        break;
                    case 'f': // four five
                        if(s.charAt(count+1)=='o'){
                            a+="4";
                            count += 4;
                        }
                        else{
                            a+="5";
                            count += 4;
                        }
                        break;
                    case 's': //six seven
                        if(s.charAt(count+1)=='i'){
                            a+="6";
                            count += 3;
                        }
                        else{
                            a+="7";
                            count += 5;
                        }
                        break;
                    case 'e': //eight
                        a+="8";
                        count += 5;
                        break;
                    case 'n': // nine
                        a+="9";
                        count += 4;
                        break;
                    default:
                        a+=s.charAt(count);
                        count++;
                }
                answer = Integer.parseInt(a);
            }
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution("one4seveneight"));
    }
}
