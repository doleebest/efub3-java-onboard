package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers){
        List<Integer> answer = new ArrayList<>();
        // average
        int avg = 0;
        int sum = 0;
        for (int i=0; i<numbers.size(); i++){
            sum += numbers.get(i);
        }
        avg = sum/numbers.size();
        answer.add(avg);

        //median
        int max = numbers.get(0);
        for (int i=0; i<numbers.size(); i++){
            if(numbers.get(i)>max)
                max = numbers.get(i);
        }
        answer.add(max);

        return answer;
    }
}
