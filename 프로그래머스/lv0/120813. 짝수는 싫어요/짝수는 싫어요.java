import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer;
        int index = 0;
        
        if(n % 2 != 0) {
          n ++;  
        } 
        answer = new int[n/2];        
        
        for(int i = 1; i < n; i++) {
            if(i % 2 != 0) {
                answer[index] = i;
                index++;
            }
        }
        
        
        return answer;
    }
}