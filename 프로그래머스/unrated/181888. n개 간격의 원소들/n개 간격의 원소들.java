import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer>an = new ArrayList<>();
        for (int i = 0; i<num_list.length; i+=n){
            an.add(num_list[i]);
        }
        int answer[] = new int[an.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = an.get(i);
        }
        return answer;
    }
}