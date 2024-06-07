package Hash;

import java.util.Arrays;

public class Square {
    public static void main(String[] args) {
        Square square = new Square();
        int solution = square.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
        System.out.println("solution = " + solution);
    }

    public int solution(int[][] sizes) {
        int firstMaxNumber;
        int lastMaxNumber;
        for(int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }
        firstMaxNumber = sizes[0][0];
        lastMaxNumber = sizes[0][1];
        for(int i = 1; i < sizes.length; i++) {
            int max = Math.max(firstMaxNumber, sizes[i][0]);
            firstMaxNumber = max;
        }
        for(int i = 1; i < sizes.length; i++) {
            int max = Math.max(lastMaxNumber, sizes[i][1]);
            lastMaxNumber = max;
        }
        return firstMaxNumber * lastMaxNumber;
    }
}