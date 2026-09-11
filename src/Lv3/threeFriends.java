package Lv3;

public class threeFriends {
    class Solution{
        static public int solution(int[] number){
            int answer = 0;
            for(int i=0; i<number.length; i++){
                int start = number[i];
                for(int j=i+1; j<number.length; j++){
                    int from = number[j];
                    for(int k= j+1; k<number.length; k++){
                        int here = number[k];
                        //System.out.println("start:"+start+"/from:"+from+"/here:"+here);
                        if(start+from+here == 0) answer++;
                    }
                }
            }
            //System.out.println(answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] num = {-2,3,0,2,-5};
        int[] num2 = {0,0,0,1,1,1,1,1,1,1,1,0,0};
        Solution.solution(num2);
    }
}
