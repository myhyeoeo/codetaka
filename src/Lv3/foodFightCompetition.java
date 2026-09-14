package Lv3;

import java.util.ArrayList;

public class foodFightCompetition {
    class Solution{
        static public String solution(int[] food){
            String answer = "";
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i=1; i<food.length; i++){
                if(food[i]%2 == 0){

                }
                else{
                    food[i] = food[i] - 1;
                }
                for(int j=0; j<food[i]/2; j++){
                    arr.add(i);
                }

            }
            arr.add(0);

            for(int i=arr.size()-2; i>=0; i--){
                arr.add(arr.get(i));
            }
            for(int i=0; i<arr.size(); i++){
                answer += arr.get(i);
            }
//            System.out.println(answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        int[] num = {1,3,4,6};
        //1 22 333 0 333 22 1
        //{1,7,1,2} -> 111 3 0 3 111
        System.out.println(Solution.solution(num));
    }
}
