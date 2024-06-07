package Hash;

import java.util.LinkedList;
import java.util.Queue;

public class Bracket {
    boolean solution(String s) {
        Queue<Character> sQueue = new LinkedList<>();
        boolean answer = false;
        int count = 0;

        for(char c : s.toCharArray()) {
            sQueue.offer(c);
        }

        while(!sQueue.isEmpty())
            if (sQueue.peek() == '(') {
                count++;
                sQueue.poll();
                while(!sQueue.isEmpty()) {
                    if (sQueue.peek() == ')') {
                        if (count == 0) {
                            count = -1;
                            break;
                        }
                        count--;
                        sQueue.poll();
                    } else if (sQueue.peek() == '(') {
                        count++;
                        sQueue.poll();
                    }
                }
            } else if (sQueue.peek() == ')') {
                if (count == 0) {
                    count = -1;
                    break;
                }
                count--;
                sQueue.poll();
            }

        if(count == 0) {
            answer = true;
        }

        return answer;
    }
}