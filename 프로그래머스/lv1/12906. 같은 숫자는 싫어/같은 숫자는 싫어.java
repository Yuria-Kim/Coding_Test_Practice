import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> an = new ArrayList<>();
        an.add(arr[0]);
        for(int i = 1; i<arr.length; i++){
            if(arr[i-1]==arr[i]){
                continue;
            }
            else{
                an.add(arr[i]);
            }
        }
        int[] answer = new int[an.size()];
        for(int i = 0; i<an.size(); i++){
            answer[i] = an.get(i);
        }
        return answer;
    }
}