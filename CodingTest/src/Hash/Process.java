package Hash;

import java.util.LinkedList;
import java.util.Queue;

public class Process {
    public static void main(String[] args) {
        Process process = new Process();
        int solution = process.solution(new int[]{2, 1, 3, 2}, 2);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i : priorities){
            queue.add(i);
        }

        while(!queue.isEmpty()){
            if(queue.peek())
        }
        return answer;
    }
}
