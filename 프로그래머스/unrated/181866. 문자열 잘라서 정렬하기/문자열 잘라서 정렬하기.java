import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] strArr = myString.split("x");

        List<String> list = new ArrayList<>();

        for(String str : strArr) {
            list.add(str);
        }

        list.removeAll(Arrays.asList("", null));

        String[] answer = list.toArray(new String[0]);
        Arrays.sort(answer);

        return answer;
    }
}