import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        
        if(arr.length % 2 == 0) {
            for(int i = 1; i < arr.length; i += 2) {
                 answer[i] += n ;
            }  
        } else if(arr.length % 2 != 0) {
            for(int i = 0; i < arr.length; i += 2) {
                answer[i] += n;
            }
        }
        
        return answer;
    }
}