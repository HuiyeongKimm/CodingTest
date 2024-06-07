package Hash;

import java.util.Arrays;

public class KNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] solution = new int[(commands[i][1] - commands[i][0] + 1)];
            int[] knumber = new int[1];
            solution = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(solution);
            System.out.println("정렬 후 넘버 : " + Arrays.toString(solution));
            knumber = Arrays.copyOfRange(solution, commands[i][2] - 1, commands[i][2]);
            System.out.println("k넘버 : " + Arrays.toString(knumber));
            answer[i] = knumber[0];

        }
        return answer;
    }
}
