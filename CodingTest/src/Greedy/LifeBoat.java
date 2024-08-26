package Greedy;

import java.util.Arrays;

public class LifeBoat {
    public static void main(String[] args) {
        LifeBoat lifeBoat = new LifeBoat();
        int solution = lifeBoat.solution(new int[]{70, 50, 80, 50, 5, 5, 10, 20, 30, 40, 2, 3, 4, 7, 6}, 100);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] people, int limit) {
        int answer = people.length;
        Arrays.sort(people);
        int peopleSum = people[0];

        for (int i = 1; i < people.length; i++) {
            if (peopleSum + people[i] <= limit) {
                answer--;
                peopleSum += people[i];
            } else {
                peopleSum = people[i];
            }
        }

        return answer;
    }
}
