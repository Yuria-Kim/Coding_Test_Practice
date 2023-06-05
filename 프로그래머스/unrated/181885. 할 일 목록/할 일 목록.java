import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String>an = new ArrayList<>();
        for(int i = 0; i<todo_list.length; i++){
            if(finished[i] == false){
                an.add(todo_list[i]);
            }
        }
        String answer[] = new String [an.size()];
        for(int i =0; i<an.size(); i++){
            answer[i] = an.get(i);
        }
        return answer;
    }
}