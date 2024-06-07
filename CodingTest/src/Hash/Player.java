package Hash;

import java.util.*;

public class Player {
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println("남아있는 선수 : " + player.player(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "mislav", "ana"}));
    }

    public String player(String[] participant, String[] completion) {
        //player라는 HashSet 객체 생성
        Set<String> player = new HashSet<String>();
        String answer = "";

        //participant에 있는 값들 player에다 넣기
        for(String i : participant) {
            player.add(i);
            System.out.println("player :" + player.toString());
        }

        //이중for문을 완주한 선수 이름이 있으면 player 변수 안에 완주한 선수들 이름 지우기
        for(int i = 0; i < participant.length; i++) {
            for (int j = 0; j < completion.length; j++) {
                if (participant[i].equals(completion[j])) {
                    player.remove(completion[j]);
                }
            }
        }
        //answer에다 player의 값을 넣고 출력하기
        answer = player.toString();
        answer = answer.replace("[", "");
        answer = answer.replace("]", "");
        return answer;
    }
}
