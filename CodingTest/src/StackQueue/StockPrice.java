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
        //answer라는 int형 배열을 선언함(배열 prices 길이만큼 배열을 만듬)
        int[] answer = new int[prices.length];
        //Queue 클래스인 queue도 선언함
        Queue<Integer> queue = new LinkedList<>();

        //prices에 있는 데이터를 queue에다 하나씩 복사함
        for(int i : prices) {
            queue.add(i);
        }

        while(!queue.isEmpty()) {
            //prices에 있는 데이터보다
            int count = 0;
            int qa = queue.poll();

            for(int i = 0; i < queue.size(); i++) {
                if(qa <= queue.peek()) {
                    count++;
                }
                queue.add(queue.poll());
            }
            answer[prices.length - queue.size() - 1] = count;
        }

        return answer;
    }
}
