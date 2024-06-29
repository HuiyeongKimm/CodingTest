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
        Queue<Integer> bridgeQueue = new LinkedList<>();
        Queue<Integer> truckQueue = new LinkedList<>();

        for(int i : truck_weights) {
            truckQueue.add(i);
        }

        for(int i = 0; i < bridge_length; i++) {
            bridgeQueue.add(0);
        }

        while(!truckQueue.isEmpty()) {

        }
        return answer;
    }
}