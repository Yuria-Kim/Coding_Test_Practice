import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
    	Arrays.sort(answer);
    	int count = 0;
        for (String str : answer) {
            if (!str.isEmpty()) {
                count++;
            }
        }
        
        String[] result = new String[count];
        int index = 0;
        for (String str : answer) {
            if (!str.isEmpty()) {
                result[index] = str;
                index++;
            }
        }
        return result;
    }
}