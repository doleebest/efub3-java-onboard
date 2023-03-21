package onboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

        int sum=0, average=0, median=0;


        for(int i=0; i<numbers.size(); i++)
            sum+=numbers.get(i);
        average=sum/numbers.size();
        answer.add(average);

        // median
        numbers.sort(Comparator.naturalOrder());
        int index = numbers.size()/2;
        if(numbers.size()%2==0){
            median = (numbers.get(index-1) + numbers.get(index))/2;
        }
        else {
            median = numbers.get(index);
        }
        answer.add(median);

        return answer;
    }
}
