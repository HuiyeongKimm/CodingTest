package Hash;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Development {
    public static void main(String[] args) {
        Development development = new Development();
        List<Integer> solutionList = development.solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1});
        System.out.println("solution = " + solutionList);
    }

    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new LinkedList<>();
        int count = 1;
        Queue<Integer> answerQueue = new LinkedList<>();

        for(int i = 0; i < progresses.length; i++) {
            answerQueue.add((int) Math.ceil((double) (100 - progresses[i]) / speeds[i]));
        }

        while(!answerQueue.isEmpty()) {
            int number = answerQueue.peek();
            answerQueue.remove();
            if(answerQueue.peek() == null) {
                break;
            }
            if(number >= answerQueue.peek()) {
                count++;
            } else {
                answerList.add(count);
                count = 1;
            }
        }
        answerList.add(count);

        return answerList;
    }
}
