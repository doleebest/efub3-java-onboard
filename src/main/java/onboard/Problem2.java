package onboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards){
        Integer[] answer = new Integer[20];

        for (int i=0; i<20; i++) {
            answer[i] = i + 1;
        }

        for (int i=0; i<flipCards.length; i++) {
            int start = flipCards[i][0] - 1;
            int end = flipCards[i][1] - 1;

            int len = end - start + 1;

            Integer[] copy = new Integer[len];

            for (int j=0; j<len; j++) {
                copy[j] = answer[start + j];
            }

            //구간만큼 역순정렬
            for (int k=0; k<len; k++) {
                answer[start + k] = copy[len - (k + 1)];
            }
        }

        return answer;
    }
}