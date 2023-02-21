class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        
        int min = Math.min(numer, denom);
        int max = Math.max(numer, denom);
        
        int gcm;
        while(true) {
            int nmg = max % min;
            if(nmg == 0) {
                gcm = min;
                break;
            } else {
                max = min;
                min = nmg;
            }
            
        }
        numer /= gcm;
        denom /= gcm;
        
        
        
        
        int[] answer = {numer, denom};
        return answer;
    }
}