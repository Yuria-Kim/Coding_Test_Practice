import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {

        List<Integer>an = new ArrayList<>();
        for(int i = 0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                an.add(numlist[i]);
            }
        }
        int answer[] = new int[an.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = an.get(i);
        }
        
        return answer;
    }
}