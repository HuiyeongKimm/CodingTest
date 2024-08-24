package Basic;

public class Double {
    public static void main(String[] args) {
        Double d = new Double();
        int solution = d.solution(1, 16);
        System.out.println("solution = " + solution);
    }

    public int solution(int num1, int num2) {
        int answer = 0;
        double ad = ((double) num1 / num2) * 1000;
        answer = (int) ad;

        return answer;
    }
}
