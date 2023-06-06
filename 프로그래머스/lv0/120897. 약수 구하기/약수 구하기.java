import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> measure = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(n%i ==0){
                measure.add(i);
            }
        }
        int[] answer = new int[measure.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = measure.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}