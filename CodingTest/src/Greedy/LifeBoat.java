package Greedy;

import java.util.Arrays;

public class LifeBoat {
    public static void main(String[] args) {
        LifeBoat lifeBoat = new LifeBoat();
        int solution = lifeBoat.solution(new int[]{70, 50, 80, 50, 5, 5, 10, 20, 30, 40, 40, 40, 30, 30}, 100);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] people, int limit) {
        int answer = people.length;
        Arrays.sort(people);
        int index = people.length;

        for (int i = 0; i < index; i++) {
            if ((people[i] + people[index - 1]) <= limit) {
                answer--;
                index--;
            } else {
                index--;
            }
        }

        return answer;
    }
}
