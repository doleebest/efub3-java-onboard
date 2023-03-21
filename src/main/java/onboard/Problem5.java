package onboard;

public class Problem5 {
    public static Integer solution(Integer N, Integer K, Integer[] values){
        Integer answer = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (values[i] <= K) {
                answer += K / values[i];
                K %= values[i];
            }
        }
        int money = K;

        for(int i=N-1; i>=0; i--){
            answer += money/values[i];
            money = money%values[i];
        }

        return answer;
    }
}
