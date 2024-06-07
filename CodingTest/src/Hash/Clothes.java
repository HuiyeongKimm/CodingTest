import java.util.HashMap;
import java.util.Iterator;

public class Clothes {
    public static void main(String[] args) {
        Clothes clothes = new Clothes();
        int solution = clothes.solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}});
        System.out.println("Solution: " + solution);
    }

    public int solution(String[][] clothes) {
        HashMap<String, Integer> mapClothes = new HashMap<>();
        int answer = 1;

        for(int i = 0; i < clothes.length; i++) {
            mapClothes.put(clothes[i][1], mapClothes.getOrDefault(clothes[i][1], 1) + 1); //이해 x -> 왜 값이 늘어나는지 ?
        }

        for(Integer i : mapClothes.values()) {
            answer = answer * i;
        }
//        Iterator<Integer> iterator = mapClothes.values().iterator();
//
//        while(iterator.hasNext()) {
//            answer *= iterator.next().intValue();
//        }
        return answer - 1;
    }
}