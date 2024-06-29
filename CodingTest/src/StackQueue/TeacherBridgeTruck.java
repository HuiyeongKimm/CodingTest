package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class TeacherBridgeTruck {
    public static void main(String[] args) {
        TeacherBridgeTruck teacherBridgeTruck = new TeacherBridgeTruck();
        int solution = teacherBridgeTruck.solution(2, 10, new int[]{7, 4, 5, 6});
        System.out.println("solution = " + solution);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridgeQueue = new LinkedList<>();
        Queue<Integer> truckQueue = new LinkedList<>();

        // 트럭 무게들을 대기 큐에 넣는다.
        for (int truck : truck_weights) {
            truckQueue.offer(truck);
        }

        int currentWeight = 0;
        int time = 0;

        // 초기 다리 상태를 큐로 채운다.
        for (int i = 0; i < bridge_length; i++) {
            bridgeQueue.offer(0);
        }

        while (!bridgeQueue.isEmpty()) {
            time++;
            // 다리에서 트럭을 하나 제거한다.
            currentWeight -= bridgeQueue.poll();

            // 대기 트럭이 있는 경우
            if (!truckQueue.isEmpty()) {
                // 다음 트럭의 무게가 현재 다리의 여유 무게보다 작거나 같다면 트럭을 다리에 올린다.
                if (currentWeight + truckQueue.peek() <= weight) {
                    int truck = truckQueue.poll();
                    bridgeQueue.offer(truck);
                    currentWeight += truck;
                } else {
                    // 트럭을 다리에 올릴 수 없다면 0을 올린다.
                    bridgeQueue.offer(0);
                }
            }
        }

        return time;
    }
}
