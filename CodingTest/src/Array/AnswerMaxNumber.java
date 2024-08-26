package Array;

import java.util.Arrays;

public class AnswerMaxNumber {
    public static void main(String[] args) {
        AnswerMaxNumber maxNumber = new AnswerMaxNumber();
        String solution = maxNumber.solution(new int[]{3, 30, 34, 5, 9});
        System.out.println("solution = " + solution);
    }

    public String solution(int[] numbers) {
        String answer = "";
        String[] answerStr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answerStr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(answerStr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2)); //    o2+o1,o1+o2 는 맞고 o1+o2,o2+o1은 틀림. 왜 ?

        for (int i = 0; i < answerStr.length; i++) {
            answer += answerStr[i];
        }

        if (answerStr[0].equals("0")) {
            answer = "0";
        }

        return answer;
    }
}
