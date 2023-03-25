class Solution {
    public String solution(int age) {
        String answer = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        String num = Integer.toString(age);
        
        for(int i = 0; i < num.length(); i++) {
            answer += alphabet.charAt(num.charAt(i)-48);
        }           
            
        return answer;
    }
}