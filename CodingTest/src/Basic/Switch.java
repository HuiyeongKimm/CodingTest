package Basic;

public class Switch {
    public static void main(String[] args) {
        Switch sw = new Switch();
        int solution = sw.solution(70);
        System.out.println("solution = " + solution);
    }

    public int solution(int angle) {
        int answer = 0;
        if (angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle > 90 && angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }

        return answer;
    }
}
