import java.util.*;
class Solution {
    public String solution(String my_string) {
        String arr [] = my_string.split("");
		Set<String> an = new LinkedHashSet<>(Arrays.asList(arr));
		
		String answer = "";
		
		for(String temp : an) {
			answer += temp;
		}
        return answer;
    }
}