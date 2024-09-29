package Greedy;

public class MakeMaxNumber {
    public static void main(String[] args) {
        MakeMaxNumber makeMaxNumber = new MakeMaxNumber();
        String solution = makeMaxNumber.solution("4177252841", 4);
        System.out.println("solution = " + solution);
    }

    public String solution(String number, int k) {
        return makeNumber(number, k);
    }

    public String makeNumber(String number, int k) {
        StringBuilder sb = new StringBuilder(number);

        while (k > 0) {
            int comNum1 = 0;
            int comNum2 = 0;

            if (sb.charAt(0) == sb.charAt(1)) { //sb의 첫, 두번쨰 글자가 같다면 두,세번쨰와 세,네번쨰 글자 추출
                comNum1 = Integer.parseInt(sb.charAt(1) + "" + sb.charAt(2));
                comNum2 = Integer.parseInt(sb.charAt(2) + "" + sb.charAt(3));

                sb = sb.deleteCharAt(compareChar(comNum1, comNum2, 1));
            } else {
                comNum1 = Integer.parseInt(sb.charAt(0) + "" + sb.charAt(1)); // sb의 첫번째, 두번쨰 글자 추출 후 int로 형 변환
                comNum2 = Integer.parseInt(sb.charAt(1) + "" + sb.charAt(2)); // sb의 두번째, 세번쨰 글자 추출 후 int로 형 변환

                sb = sb.deleteCharAt(compareChar(comNum1, comNum2, 0));
            }

            k--;
        }
        return sb.toString();
    }

    public int compareChar(int comNum1, int comNum2, int i) { // comNum1,2 숫자 비교 후 작은 수 중 십의 자리와 일의 자리 수 비교 후 작은 수의 인덱스 번호 반환
        char minChar1 = (Math.min(comNum1, comNum2) + "").charAt(0);
        char minChar2 = (Math.min(comNum1, comNum2) + "").charAt(1);
        int minNum1 = Integer.parseInt(String.valueOf(minChar1));
        int minNum2 = Integer.parseInt(String.valueOf(minChar2));

        if (comNum1 <= comNum2) { // 작은 수의 인덱스 번호 찾고 반환하기
            if (minNum1 <= minNum2) {
                return i;
            } else {
                return 1 + i;
            }
        } else {
            if (minNum1 <= minNum2) {
                return 1 + i;
            } else {
                return 2 + i;
            }
        }
    }
}
