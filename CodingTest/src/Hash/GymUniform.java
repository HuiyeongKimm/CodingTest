package Hash;

public class GymUniform {
    public static void main(String[] args) {
        GymUniform gymUniform = new GymUniform();
        int solution = gymUniform.solution(100, new int[]{2, 3, 4, 60, 70, 45}, new int[]{1, 3, 5, 46, 65, 75});
        System.out.println("solution : " + solution);
    }

//    public int solution(int n, int[] lost, int[] reserve) {
//        int answer = n - lost.length;
//
//        for(int i = 0; i < reserve.length; i++) {
//            for(int j = 0; j < lost.length; j++) {
//                if(reserve[i] + 1 == lost[j] || reserve[i] - 1 == lost[j]) {
//                    lost[j] = -1;
//                    reserve[i] = -1;
//                    answer++;
//                }
//            }
//        }
//        이 코드의 문제점 : 여벌이 있는 학생도 체육복을 잃어버릴 수 있다는 코드는 안 씀
//        return answer;
//    }

    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        for(int i = 0; i < reserve.length; i++) {
            for(int j = 0; j < lost.length; j++) {
                if(reserve[i] == lost[j]) {
                    lost[j] = -1;
                    reserve[i] = -1;
                    answer++;
                }
            }
        }

        for(int i = 0; i < reserve.length; i++) {
            for(int j = 0; j < lost.length; j++) {
                if(reserve[i] + 1 == lost[j] || reserve[i] - 1 == lost[j]) {
                    lost[j] = -1;
                    reserve[i] = -1;
                    answer++;
                }
            }
        }

        return answer;
    }
}