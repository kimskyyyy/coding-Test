class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        
        while(n > slice * answer) {
            answer++;
            if(n <= slice * answer) {
                break;
            } 
        }
        return answer;
    }
}