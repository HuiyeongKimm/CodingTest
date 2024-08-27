package Greedy;

import java.util.Arrays;

public class LifeBoat {
    public static void main(String[] args) {
        LifeBoat lifeBoat = new LifeBoat();
        int solution = lifeBoat.solution(new int[]{70, 50, 80}, 100);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] people, int limit) {
        int answer = people.length;
        Arrays.sort(people);
        int index = people.length - 1;

        for (int i = 0; i < index; i++) {
            if ((people[i] + people[index]) <= limit) {
                answer--;
                index--;
            } else {
                i--;
                index--;
            }
        }

        return answer;
    }
}
