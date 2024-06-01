package Hash;

import java.util.HashMap;

public class PhoneNumberList {
    public static void main(String[] args) {
        PhoneNumberList phoneNumberList = new PhoneNumberList();
        boolean solution = phoneNumberList.solution(new String[]{"123","456123","123789"});
        System.out.println("solution = " + solution);
    }

    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> mapPnl = new HashMap<>();
        boolean answer = true;

        for(String pnl : phone_book) {
            mapPnl.put(pnl, 1);
        }

        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 0; j < phone_book[i].length(); j++) {
                System.out.println(phone_book[i].substring(0, j));
                //이해가 안 가는 이유 : 배열에 있는 숫자를 맵에 옮긴 거면 같은 숫자 아닌지 ? 같은 숫자여서 맵과 배열을 한 글자씩 대조하면 결과값이 무조건 false가 나올 거 같은데 아닌 이유가 궁금함
                if(mapPnl.containsKey(phone_book[i].substring(0, j))) {
                    answer = false;
                }
            }
        }
        return answer;
    }
}
