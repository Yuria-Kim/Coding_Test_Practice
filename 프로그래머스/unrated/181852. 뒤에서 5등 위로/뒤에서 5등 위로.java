import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length-5];
        Arrays.sort(num_list);
        int index = 5;
        for(int i = 0; i<answer.length; i++){
            answer[i] = num_list[index];
            index++;
        }
        return answer;
    }
}