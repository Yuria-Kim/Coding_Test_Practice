import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replaceAll("[a-c]", "_");
		String[] answer = Arrays.stream(myStr.split("_"))
                .filter(s -> s != null && !s.isEmpty())
                .toArray(String[]::new);
        if(answer.length==0){
            String[] em = {"EMPTY"};
            return em;
        }
        return answer;
    }
}