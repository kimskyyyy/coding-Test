class Solution {
    public int[] solution(int n, int k) {
        int size = n/k;
        int cnt = 0;
        int[] answer = new int[size];
        
        for(int i = 1; i <= n; i++) {
            if(i % k == 0) {
                answer[cnt] = i; 
                cnt++;
            }
        }
        
        return answer;
    }
}