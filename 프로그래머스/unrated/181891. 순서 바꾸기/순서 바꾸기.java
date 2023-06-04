import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        
        //n번째 원소 이후의 원소들
        int[] after = new int[num_list.length-n];
        int j = 0;
        for(int i = n; i<num_list.length; i++){
            after[j] = num_list[i];
            j++;
        }
        //n번째까지의 원소들
        int[] before = new int[n];
        j = 0;
        for(int i = 0; i<n; i++){
            before[j] = num_list[i];
            j++;
        }
        //이후의원소 + 까지의 원소 return
        int[] answer = new int[after.length+before.length];
        System.arraycopy(after, 0, answer, 0, after.length);
        System.arraycopy(before, 0, answer, after.length, before.length);
        
        return answer;
    }
}