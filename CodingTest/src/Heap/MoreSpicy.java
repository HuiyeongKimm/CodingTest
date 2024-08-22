package Heap;

import java.util.PriorityQueue;

public class MoreSpicy {
    public static void main(String[] args) {
        MoreSpicy moreSpicy = new MoreSpicy();
        int solution = moreSpicy.solution(new int[]{1, 2, 3, 9, 10, 12}, 7);
        System.out.println("Solution: " + solution);
    }

    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;

        for (int i : scoville) {
            pq.add(i);
        }

        while (pq.peek() < K && pq.size() >= 2) {
            int minScoville = pq.poll();
            int secondScoville = pq.poll();
            int scovile = minScoville + (secondScoville * 2);

            pq.add(scovile);
            answer++;

            if (pq.peek() >= K) {
                return answer;
            }
        }

        return -1;
    }
}
