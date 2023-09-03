class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
        
        answer += Integer.parseInt(arr[0]);
        
        for(int i = 1; i < arr.length - 1; i++) {
             if(arr[i].equals("+")) {
                answer += Integer.parseInt(arr[i+1]);
             } else if(arr[i].equals("-")) {
                 answer -= Integer.parseInt(arr[i+1]);
             } 
        }
       
        
        // 숫자가 두개만 들어온다고 풀면 런타임에러..
        // if(arr[1].equals("+")) {
        //     answer += Integer.parseInt(arr[2]);
        // } else if(arr[1].equals("-")) {
        //     answer -= Integer.parseInt(arr[2]);
        // }
        
        return answer;
    }
}