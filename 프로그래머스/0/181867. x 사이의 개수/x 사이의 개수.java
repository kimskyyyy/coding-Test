class Solution {
    public int[] solution(String myString) {
        String[] strList = myString.split("x", myString.length());
        int[] answer = new int[strList.length];
        for (int i = 0; i < strList.length; i++) {
            answer[i] = strList[i].length();
        }
        return answer;
    }
}