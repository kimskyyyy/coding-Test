class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width = 0;
        int height = 0;
        
        for(int i = 1; i < 3; i++) {
            if(dots[0][0] != dots[i][0]) {
                width = Math.abs(dots[0][0] - dots[i][0]);
            }
            if(dots[0][1] != dots[i][1]) {
                 height = Math.abs(dots[0][1] - dots[i][1]);
            }
        }       
        
        answer = width * height;
        
        return answer;
    }
}