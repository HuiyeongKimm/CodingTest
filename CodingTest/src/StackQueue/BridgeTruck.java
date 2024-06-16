package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class BridgeTruck {
    public static void main(String[] args) {
        BridgeTruck bridgeTruck = new BridgeTruck();
        int solution = bridgeTruck.solution(2, 10, new int[]{7, 4, 5, 6});
        System.out.println("solution = " + solution);
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int count = 0;
        Queue<Integer> waitQueue = new LinkedList<>();
        Queue<Integer> truckQueue = new LinkedList<>();

        for(int i : truck_weights) {
            waitQueue.add(i);
        }

        while(!waitQueue.isEmpty() || !truckQueue.isEmpty()) {
            truckQueue.add(waitQueue.poll());

            if (truckQueue.stream().mapToInt(Integer::intValue).sum()
                    + waitQueue.peek() < weight) {
                answer += bridge_length;
                count += bridge_length;
            }

            if(count == bridge_length) {
                truckQueue.poll();
                count = 0;
            }
            count++;
            answer++;
        }
        return answer;
    }
}