import java.util.*;
class Solution {
    public int[] solution(String myString) {
        List<Integer>len = new ArrayList<>();
        String div[] = myString.split("x", -1);
        for(int i = 0; i<div.length; i++){
            len.add(div[i].length());
        }
        int[] answer = new int[len.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = len.get(i);
        }
        return answer;
    }
}