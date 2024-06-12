package StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class BridgeTruck {
    public static void main(String[] args) {
        BridgeTruck bridgeTruck = new BridgeTruck();
        int solution = bridgeTruck.solution(2, 10, new int[]{7, 4, 5, 6});
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int i : truck_weights) {
            queue.add(i);
        }

        while(!queue.isEmpty()) {
            if(queue.peek() <= weight) {

            }
            answer++;
        }
        return answer;
    }
}
