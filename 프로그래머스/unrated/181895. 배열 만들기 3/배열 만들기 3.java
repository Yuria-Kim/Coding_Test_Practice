import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        
        List<Integer>a_list = new ArrayList<>();
        
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                a_list.add(arr[j]);
            }
        } 
        answer = new int[a_list.size()];
        for(int i =0; i<a_list.size(); i++){
            answer[i] = a_list.get(i);
        }
        return answer;
    }
}