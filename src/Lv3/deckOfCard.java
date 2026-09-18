package Lv3;

public class deckOfCard {
    static public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int countA=0;
        int countB=0;

        for(int i=0; i<goal.length; i++){
            if(countA<cards1.length && goal[i].equals(cards1[countA])) {
                countA++;
            }
            else if(countB<cards2.length && goal[i].equals(cards2[countB])){
                countB++;
            }
            else return "No";
        }

        return "Yes";
    }

    public static void main(String[] args) {
        String[] a = {"i", "drink", "water"};
        String[] b = {"want", "to"};
        String[] c = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(a,b,c));
    }
}

