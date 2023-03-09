package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> solution(Integer hour, Integer minute) {
        List<Integer> answer = new ArrayList<>();
        if (hour != 0) {
            if (minute > 45) {
                answer.add(hour);
                answer.add(minute - 45);
            } else if (minute == 45) {
                answer.add(hour);
                answer.add(0);
            } else if (minute < 45) {
                answer.add(hour - 1);
                answer.add(minute + 15);
            }
        } else if (hour == 0) {
            if (minute > 45) {
                answer.add(hour);
                answer.add(minute - 45);
            } else if (minute == 45) {
                hour = 23;
                answer.add(hour);
                answer.add(0);
            } else if (minute < 45) {
                hour = 23;
                answer.add(hour);
                answer.add(minute + 15);
            }
        }
        return answer;
    }
}
