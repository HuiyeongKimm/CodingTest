package Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GiveUpMath {
    public static void main(String[] args) {
        GiveUpMath giveUpMath = new GiveUpMath();
        List<Integer> solutionList = new ArrayList<>();
        solutionList = giveUpMath.solution(new int[]{1,2,3,4,5});
        System.out.println("solution : " + solutionList.toString());
    }

    public int[] giveUpMath1(int[] answers) { //수포자1 -> 내가 임의로 1~5 지정해버림
        int[] giveUpMath1Arr = new int[answers.length];
        int count = 0;
        int i = 1;

        while(answers.length > count) {
            giveUpMath1Arr[count] = i;
            if(count % 5 == 4) { i = 0; }
            i++;
            count++;
        }
        return giveUpMath1Arr;
    }

    public int[] giveUpMath2(int[] answers) { //수포자2 -> 내가 임의로 1~5 지정해버림
        int[] giveUpMath2Arr = new int[answers.length];
        int count = 0;
        int i = 1;

        while(answers.length > count) {
            if(count % 2 == 0) {
                giveUpMath2Arr[count] = 2;
            } else {
                if(i == 2) {
                    i++;
                    giveUpMath2Arr[count] = i;
                } else {
                    giveUpMath2Arr[count] = i;
                }
                if(i % 5 == 0) { i = 0; }
                i++;
            }
            count++;
        }
        return giveUpMath2Arr;
    }

    public int[] giveUpMath3(int[] answers) { //수포자3 -> 내가 임의로 1~5 지정해버림
        int[] giveUpMath3Arr = new int[answers.length];
        int count = 0;
        int i = 1;

        while(answers.length > count) {
            switch(count % 10) {
                case 0, 1 : giveUpMath3Arr[count] = 3;
                    break;
                case 2, 3 : giveUpMath3Arr[count] = 1;
                    break;
                case 4, 5 : giveUpMath3Arr[count] = 2;
                    break;
                case 6, 7 : giveUpMath3Arr[count] = 4;
                    break;
                case 8, 9 : giveUpMath3Arr[count] = 5;
                    break;
            }
            if(count % 10 == 0) { i = 0; }
            count++;
        }
        return giveUpMath3Arr;
    }

    public List solution(int[] answers) { //모의고사 -> answer 길이를 3으로 정하고 코드가 너무 길고 정렬을 내가 지정해버림
                                          //모의고사 -> answerList를 List로 받아줌(배열로 받아보고싶음)
        List<Integer> answerList = new ArrayList<>();
        int[] gumAnswer1Arr = giveUpMath1(answers);
        int[] gumAnswer2Arr = giveUpMath2(answers);
        int[] gumAnswer3Arr = giveUpMath3(answers);
        int gumCount1 = 0;
        int gumCount2 = 0;
        int gumCount3 = 0;

        for(int i = 0; i < answers.length; i++) {
            if(gumAnswer1Arr[i] == answers[i]) {
                gumCount1++;
            }
            if (gumAnswer2Arr[i] == answers[i]) {
                gumCount2++;
            }
            if (gumAnswer3Arr[i] == answers[i]) {
                gumCount3++;
            }
        }

        if(gumCount1 > gumCount2 && gumCount1 > gumCount3) {
            answerList.add(1);
        } else if (gumCount2 > gumCount1 && gumCount2 > gumCount3)
            answerList.add(2);
//        } else if (gumCount3 > gumCount1 && gumCount3 > gumCount2) {
//            answerList.add(3);
//        } else if (gumCount1 == gumCount2 && gumCount1 > gumCount3) {
//            answerList.add(1);
//            answerList.add(2);
//        } else if (gumCount1 == gumCount3 && gumCount1 > gumCount2) {
//            answerList.add(1);
//            answerList.add(3);
//        } else if (gumCount2 == gumCount3 && gumCount2 > gumCount1) {
//            answerList.add(2);
//            answerList.add(3);
//        } else {
//            answerList.add(1);
//            answerList.add(2);
//            answerList.add(3);
//        }

        return answerList;
    }
}
