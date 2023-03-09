package onboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

/**
 * 리턴값 answer의 경우, 변수 초기값은 변경 가능합니다.
 * 다만 answer로 return하는 것은 변경하지 않도록 주의해주세요.
 */
public class Problem4 {
    public static Integer solution(Integer number)
    {
        Integer answer = 0;
        String num = Integer.toString(number);
        String[] arr = new String[num.length()]; // 자릿수 만큼 배열 만들기

        for (int i=0; i<num.length(); i++){
            arr[i] = String.valueOf(num.charAt(i));
        }
        Arrays.sort(arr, reverseOrder());

        String last = "";
        for(int i=0; i<num.length(); i++){
            last = String.join("", last, arr[i]);
        }
        answer = Integer.parseInt(last);


        return answer;
    }
}

