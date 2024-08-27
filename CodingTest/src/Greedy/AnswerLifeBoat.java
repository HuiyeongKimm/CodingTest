package Greedy;

import java.util.Arrays;

public class AnswerLifeBoat {
    public static void main(String[] args) {
        AnswerLifeBoat answerLifeBoat = new AnswerLifeBoat();
        int solution = answerLifeBoat.solution(new int[]{70, 50, 80, 50, 5, 5, 10, 20, 30, 40, 40, 40, 30, 30}, 100);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int index = 0;

        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                index++;
                answer++;
            }
            else {
                answer++;
            }
        }

        return answer;
    }
}
