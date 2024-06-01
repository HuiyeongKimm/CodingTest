package Hash;

import java.util.HashMap;

public class SetMapPlayer {
    public static void main(String[] args) {
        SetMapPlayer setMapPlayer = new SetMapPlayer();
        String answer = setMapPlayer.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println("answer = " + answer);
    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> player = new HashMap<String, Integer>();
        for(int i = 0; i < participant.length; i++) {
            player.put(participant[i], 1);
//                if(player.) {
//                    player.put(participant[i], 2);
//                }
        }

        System.out.println("해쉬맵 : " + player.toString());

        for(int i = 0; i < completion.length; i++) {
            if(player.get(completion[i]) == 1) {
                player.remove(completion[i]);
            }
        }

        answer = player.toString();
        return answer;
    }
}
