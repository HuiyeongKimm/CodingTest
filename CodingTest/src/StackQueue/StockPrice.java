package StackQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class StockPrice {
    public static void main(String[] args) {
        StockPrice stockPrice = new StockPrice();
        int[] solution = stockPrice.solution(new int[]{1,2,3,2,3});
        System.out.println("soulution : " + Arrays.toString(solution));
    }

    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> queue = new LinkedList<>();

        for(int i : prices) {
            queue.add(i);
        }

        while(!queue.isEmpty()) {
            int count = queue.size() - 1;
            int qa = queue.poll();

            for(int i = 0; i < queue.size(); i++) {
                if(qa > queue.peek()) {
                    count--;
                }
                queue.add(queue.poll());
            }
            answer[prices.length - queue.size() - 1] = count;
        }

        return answer;
    }
}
