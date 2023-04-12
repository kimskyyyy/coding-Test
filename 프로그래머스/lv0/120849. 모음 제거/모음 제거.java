class Solution {
    public String solution(String my_string) {
        String[] five = {"a", "e", "i", "o", "u"};
        
        for(String f : five) {
            my_string = my_string.replaceAll(f, "");
        }
        
        return my_string;
    }
}