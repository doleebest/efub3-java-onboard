package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards){
        Integer[] answer = {};
        Integer[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int i = 0; i<= flipCards.length; i++){
            for(int j=0; j/2==(flipCards[i][0]+flipCards[i][1])/2; j++)
                num[flipCards[i][0]+j] = num[flipCards[i][1]-j];
        }
        answer = num;
        Integer[] answer = new Integer[20];
        for(int i=0; i<20; i++){  // initialize
            answer[i] = i+1;
        }

        int count = 0;
        while(count < 10){
            int a = flipCards[count][0] - 1;
            int b = flipCards[count][1] - 1;
            int mid = (a+b) / 2;
            int temp = 0;
            for(int i=a, j=b; i<=mid; i++, j--){
                temp = answer[i];
                answer[i] = answer[j];
                answer[j] = temp;
            }
            count++;
        }

        return answer;
    }
}
