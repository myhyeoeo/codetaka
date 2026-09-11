package Lv2;

public class addMatrix {
    static class Solution {
        static public int[][] solution(int[][] arr1, int[][] arr2) {
            // arr1과 동일한 크기의 새로운 2차원 배열 생성
            int[][] answer = new int[arr1.length][arr1[0].length];

            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[0].length; j++) {
                    answer[i][j] = arr1[i][j] + arr2[i][j];
                    //System.out.print(answer[i][j] + " ");
                }
                //System.out.println();
            }
            return answer;
        }
    }

    // main 메서드는 Solution 바깥, addMatrix 클래스 내부에 위치해야 합니다.
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};

        Solution.solution(arr1, arr2);
    }
}