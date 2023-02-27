class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] frequent = new int [1000]; 
        int max = 0;
        int count = 0;
        
        for(int i = 0; i < array.length; i++) {
            frequent[array[i]]++;
            
            if (max < frequent[array[i]]) {
                max = frequent[array[i]];
                answer = array[i];
            }
        }
        
        for(int i = 0; i < frequent.length; i++) {
            if(max  == frequent[i]) {
                count++;
            }
            if(count > 1) {
                answer = -1;
            }
        }       
        
        return answer;
    }
}