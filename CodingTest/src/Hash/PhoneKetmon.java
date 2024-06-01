package Hash;

import java.util.HashSet;

public class PhoneKetmon {
    public static void main(String[] args) {
        PhoneKetmon phoneKetmon = new PhoneKetmon();
        int solution = phoneKetmon.solution(new int[]{3,3,3,2,2,4});
        System.out.println("solution : " + solution);
    }

    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> phonKetmon = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            phonKetmon.add(nums[i]);
        }

        System.out.println("phonKetmon.size = " + phonKetmon.size());
        answer = Math.min(phonKetmon.size(), nums.length / 2);
        return answer;
    }
}
