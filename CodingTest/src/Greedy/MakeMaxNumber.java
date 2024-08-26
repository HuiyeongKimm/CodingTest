package Greedy;

public class MakeMaxNumber {
    public static void main(String[] args) {
        MakeMaxNumber makeMaxNumber = new MakeMaxNumber();
        String solution = makeMaxNumber.solution("1231234", 3);
        System.out.println("solution = " + solution);
    }

    public String solution(String number, int k) {
        return makeNumber(number, k);
    }

    public String makeNumber(String number, int k) { //
        while (k > 0) {
            int comNum1 = Integer.parseInt(number.charAt(0) + "" + number.charAt(1)); // number의 첫번째, 두번쨰 글자 추출 후 int로 형 변환
            int comNum2 = Integer.parseInt(number.charAt(1) + "" + number.charAt(2)); // number의 두번째, 세번쨰 글자 추출 후 int로 형 변환
            if (number.charAt(0) == number.charAt(1)) { //number의 첫, 두번쨰 글자가 같다면 두,세번쨰와 세,네번쨰 글자 추출
                comNum1 = Integer.parseInt(number.charAt(1) + "" + number.charAt(2));
                comNum2 = Integer.parseInt(number.charAt(2) + "" + number.charAt(3));
            }
            number = number.replaceFirst(compareChar(comNum1, comNum2), ""); //number 중 compareChar() 결과물을 number에서 발견 시 한 번만 삭제
            k--;
        }
        return number;
    }

    public String compareChar(int comNum1, int comNum2) { // comNum1,2 숫자 비교 후 작은 수 중 십의 자리와 일의 자리 수 비교 후 작은 수 반환
        char minChar1 = (Math.min(comNum1, comNum2) + "").charAt(0);
        char minChar2 = (Math.min(comNum1, comNum2) + "").charAt(1);
        int minNum1 = Integer.parseInt(String.valueOf(minChar1));
        int minNum2 = Integer.parseInt(String.valueOf(minChar2));

        return Integer.toString(Math.min(minNum1, minNum2)); //String으로 변환 후 반환
    }
}
