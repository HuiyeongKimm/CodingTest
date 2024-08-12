package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseball {
    public static void main(String[] args) {
        NumberBaseball numberBaseball = new NumberBaseball();
        numberBaseball.play(3);
    }

    public int[] randomPlayer(int number) {
        int[] randomNumber = new int[number];
        for (int i : randomNumber) {
            randomNumber[i] = (int) (Math.random() * 9); //랜덤함수 범위 인터넷에서 찾아봄
        }

        for (int i = 0; i < randomNumber.length - 1; i++) {
            for (int j = 0; j < randomNumber.length; j++) {
                if (i < j) {
                    if (randomNumber[i] == randomNumber[j]) {
                        randomNumber[j] = (int) (Math.random() * 9);
                        j--;
                    }
                }
            }
        }
        System.out.println("random : " + Arrays.toString(randomNumber));
        return randomNumber;
    }

    public int[] inputPlayer(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] inputNumber = new int[number];

        for (int i = 0; i < inputNumber.length; i++) {
            inputNumber[i] = scanner.nextInt();
        }

        for (int i = 0; i < inputNumber.length; i++) {
            for (int j = 0; j < inputNumber.length; j++) {
                if (i < j) {
                    if (inputNumber[i] == inputNumber[j]) {
                        inputNumber[j] = scanner.nextInt();
                        j--;
                    }
                }
            }
        }
        System.out.println("input : " + Arrays.toString(inputNumber));
        return inputNumber;
    }

    public void play(int number) {
        NumberBaseball numberBaseball = new NumberBaseball();
        System.out.println("숫자를 입력하세요.");

        int[] randomNumber = numberBaseball.randomPlayer(number);

        while (true) {
            int strike = 0;
            int ball = 0;

            int[] inputNumber = numberBaseball.inputPlayer(number);

            for (int i = 0; i < number; i++) {
                if (randomNumber[i] == inputNumber[i]) {
                    strike++;
                }
            }

            for (int i = 0; i < randomNumber.length; i++) {
                for (int j = 0; j < inputNumber.length; j++) {
                    if (randomNumber[i] == inputNumber[j]) {
                        if (i != j) {
                            ball++;
                        }
                    }
                }
            }
            System.out.println("strike : " + strike);
            System.out.println("ball : " + ball);
            if (strike == number) {
                break;
            }
        }

        System.out.println("정답입니다.");
    }
}
