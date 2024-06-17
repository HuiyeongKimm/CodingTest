package StackQueue;

import java.util.*;

public class TeacherDevelopment {
    public static void main(String[] args) {
        TeacherDevelopment teacherDevelopment = new TeacherDevelopment();
        int[] solution = teacherDevelopment.solution(new int[]{95, 90, 99, 99, 80, 99},
                new int[]{1, 1, 1, 1, 1, 1});
        System.out.println("Solution: " + Arrays.toString(solution));
    }

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        int day = 1;
        int count = 0;

        for(int progress : progresses) {
            queue.add(progress);
        }

        while(!queue.isEmpty()) {
            boolean isComplete = (queue.peek() +
                    (speeds[progresses.length - queue.size()] * day)) >= 100;

            if(isComplete) {
                count++;
                queue.poll();
            } else {
                day++;
                if(count != 0) {
                    list.add(count);
                    count = 0;
                }
            }

            if(queue.isEmpty()) {
                list.add(count);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
