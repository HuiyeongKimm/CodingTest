package Hash;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Development {
    public static void main(String[] args) {
        Development development = new Development();
        List<Integer> solutionList = development.solution(new int[]{95, 90, 99, 99, 80, 99},
                new int[]{1, 2, 3, 4, 5, 6});
        System.out.println("solution = " + solutionList);
    }

    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new LinkedList<>();
        Queue<Integer> pq = new LinkedList<>();
        for(int i : progresses) {
            pq.add(i);
        }
//        while(!pq.isEmpty()) {
//            System.out.print("pq :" +pq.poll() );
//            System.out.println("   speed = " + speeds[speeds.length - pq.size() - 1]); //speeds
//        }
        int day = 1;
        while(!pq.isEmpty()) {
            if(pq.peek() + speeds[speeds.length - pq.size()] * day >= 100) {
                pq.poll();
            }
            day++;
        }
        return answerList;
    }
}
