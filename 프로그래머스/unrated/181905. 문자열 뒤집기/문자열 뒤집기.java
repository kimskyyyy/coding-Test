class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();
        answer.append(my_string.substring(0, s));

        StringBuilder str =  new StringBuilder(my_string.substring(s, e + 1));
        String reverse = str.reverse().toString();
        answer.append(reverse);

        if(my_string.length() != e) {
            answer.append(my_string.substring(e+1));
        }

        return answer.toString();
    }
}