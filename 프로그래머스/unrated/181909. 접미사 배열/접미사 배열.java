import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String>a_list = new ArrayList<>();
        int t = my_string.length();
        for(int i = 0; i<my_string.length(); i++){
            a_list.add(my_string.substring(i,t));
        }
        String[] answer = new String[a_list.size()];
        for (int i = 0; i < a_list.size(); i++) {
            answer[i] = a_list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}