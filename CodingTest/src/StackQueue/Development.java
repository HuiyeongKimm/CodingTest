package StackQueue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Development {
    public static void main(String[] args) {
        Development development = new Development();
        List<Integer> solutionList = development.solution(new int[]{95, 90, 99, 99, 80, 99},
                new int[]{1, 1, 1, 1, 1, 1});
        System.out.println("solution = " + solutionList);
    }

    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new LinkedList<>();
        Queue<Integer> pq = new LinkedList<>();
        int[] days = new int[progresses.length];
        int count = 1;
        int day = 1;

        for(int i : progresses) {
            pq.add(i);
        }

        while(!pq.isEmpty()) {
            if(pq.peek() + speeds[speeds.length - pq.size()] * day >= 100) {
                days[speeds.length - pq.size()] = day;
                pq.poll();
                day = 1;
            }
            day++;
        }

        for(int i = 0; i < days.length - 1; i++) {
            if(days[i] > days[i + 1]) {
                days[i + 1] = days[i];
            }

            if(days[i] == days[i + 1]) {
                count++;
            } else {
                answerList.add(count);
                count = 1;
            }
        }
        answerList.add(count);

        return answerList;
    }
}