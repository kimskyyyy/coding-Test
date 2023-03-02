class Solution {
    public int solution(int n) {
        int answer = 0;
        int big = 0;
        int small = 0;
        int gcm;
        
        if(n >= 6) {
            big = n;
            small = 6;
        } else {
            big = 6;
            small = n;
        }
        
        while(true) {
            int nmg = big % small;
            
            if(nmg == 0) {
                gcm = small;
                answer = ((6 * n) / gcm)/6;
                break;
            } else {
                big = small;
                small = nmg;
            }
        }
        
        return answer;
    }
}