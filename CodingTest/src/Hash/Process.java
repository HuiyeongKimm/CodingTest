package Hash;

import java.util.*;

public class Process {
    public static void main(String[] args) {
        Process process = new Process();
        int solution = process.solution(new int[]{2, 1, 3, 2}, 2);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());


        for(int i : priorities){
            pq.add(i);
        }
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < priorities.length; i++) {
//            map.put()
//        }

        return answer;
    }
}
