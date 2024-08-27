package Greedy;

public class AnsMakeMaxNum {
    public static void main(String[] args) {
        AnsMakeMaxNum ansMakeMaxNum = new AnsMakeMaxNum();
        String solution = ansMakeMaxNum.solution("4177252841", 4);
        System.out.println("solution = " + solution);
    }

    public String solution(String number, int k) {
        String answer = "";
        int index = 0;

        for (int i = 0; i < number.length() - k; i++) {
            int max = 0;
            for (int j = index; j <= k + i; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    index = j + 1;
                }
            }
            answer = answer + max;
        }

        return answer;
    }
}
