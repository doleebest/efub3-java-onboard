package onboard;

import java.util.ArrayList;
import java.util.List;

/**
 * 리턴값 answer의 경우, 변수 초기값은 변경 가능합니다.
 * 다만 answer로 return하는 것은 변경하지 않도록 주의해주세요.
 */
public class Problem4 {
    public static Integer solution(Integer number){
        Integer answer = 0;
        Integer[] sprt = new Integer[4];

        //자릿수 분리하기
        for(int i=3; i>=0; i--){
            sprt[i] = number/10^i;
            number = number % 10^i;
        }

        // 순서 바꾸기
        int max = sprt[0];
        int temp = 0;
        for (int i=0; i<4; i++) {
            if (max < sprt[i]) {
                temp = max;
                max = sprt[i];
                sprt[i] = temp;
            }
        }

        //answer 구하기
        for( int i=3; i>=0; i--){
            answer = answer + sprt[i]*10^i;
        }
        return answer;
    }
}
