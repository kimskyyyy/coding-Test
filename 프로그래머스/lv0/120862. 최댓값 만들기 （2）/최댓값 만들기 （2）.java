import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int size = numbers.length-1;
        Arrays.sort(numbers);
    
        int num1 = numbers[0]*numbers[1];
        int num2 = numbers[size]*numbers[size-1];
        
        if(num1 > num2) answer = num1;
        else answer = num2;
        
        return answer;
    }
}