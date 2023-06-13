import java.util.*;
class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = total/num-(answer.length/2);
        if(total%num==0){
            for(int i = 0; i<answer.length; i++){
            answer[i] = start;
            start++;
            }   
        }
        else{
            start = total/num-(answer.length/2)+1;
            for(int i = 0; i<answer.length; i++){
            answer[i] = start;
            start++;
        }
        }
        
        
        
        Arrays.sort(answer);
        return answer;
    }
}