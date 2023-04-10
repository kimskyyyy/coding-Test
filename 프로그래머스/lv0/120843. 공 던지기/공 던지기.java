class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        // 오른쪽 한 명 건너 뛰기 2, 1번부터 공 던지는데 인덱스가 0이라 k-1 
        answer = numbers[2 * (k - 1) % numbers.length];

        return answer;
    }
}