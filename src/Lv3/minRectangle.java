package Lv3;

public class minRectangle {
    class Solution{
        static public int solution(int[][] size){
            int answer = 0;
            int vMax = 0;
            int hMax = 0;

            for (int i = 0; i < size.length; i++) {
                int max = Math.max(size[i][0], size[i][1]); // 긴 쪽
                int min = Math.min(size[i][0], size[i][1]); // 짧은 쪽

                // vMax와 hMax를 각각 갱신
                vMax = Math.max(vMax, max);
                hMax = Math.max(hMax, min);
            }
            answer = vMax * hMax;
            //System.out.println(answer);
            return answer;
        }
    }

    public static void main(String[] args) {
        int[][] size = {{60,50},{30,70},{60,30},{80,40}};
        Solution.solution(size);
    }
}
