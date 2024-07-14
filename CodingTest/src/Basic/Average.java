package Basic;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        Average avg = new Average();
        double solution = avg.solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99});
        System.out.println("solution = " + solution);

    }

    public double solution(int[] numbers) {
        double answer = 0;
        answer = Arrays.stream(numbers).average().getAsDouble();

        return answer;
    }
}
