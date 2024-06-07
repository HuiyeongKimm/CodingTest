package Hash;

import java.util.*;

public class NoSameNumber {

    public List<Integer> solution(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();
        int firstNumber = 0;
        int sameNumber = 0;

        for(int num : arr) {
            System.out.println("num : " + num);
            queue.add(num);
        }

        firstNumber = queue.poll();
        answerList.add(firstNumber);

        while(!queue.isEmpty()) {
            sameNumber = (int) queue.poll();

            if(firstNumber != sameNumber) {
                answerList.add(sameNumber);
                firstNumber = sameNumber;
            }
        }
        return answerList;
    }
}