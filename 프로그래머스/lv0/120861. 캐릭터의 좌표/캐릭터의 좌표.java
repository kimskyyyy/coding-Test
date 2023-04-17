class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int x = 0;
        int y = 0;
        int boardX = board[0] / 2;
        int boardY = board[1] / 2;
        
        for(int i = 0; i < keyinput.length; i++) {
            if(keyinput[i].equals("left")) {
                x -= 1;   
                if(x < -boardX) x = -boardX;
            } else if(keyinput[i].equals("right")) {
                x += 1;
                if(x > boardX) x = boardX;
            } else if(keyinput[i].equals("up")) {
                y += 1;
                if(y > boardY) y = boardY;
            } else if(keyinput[i].equals("down")) {
                y -= 1;
                if(y < -boardY) y = -boardY;
            }
        }
        int[] answer = {x, y};
        
        
        return answer;
    }
}