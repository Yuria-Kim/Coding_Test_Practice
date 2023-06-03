import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        int a = intervals[0][0];
        int b = intervals[0][1];
        int c = intervals[1][0];
        int d = intervals[1][1];
        int sum = b-a+1+d-c+1;
        List<Integer>a_list = new ArrayList<>();
        for(int i =a; i<=b; i++){
            a_list.add(arr[i]);
        }
        for (int j=c; j<=d; j++){
            a_list.add(arr[j]);
        }
        answer = new int[a_list.size()];
        for(int i =0; i<a_list.size(); i++){
            answer[i] = a_list.get(i);
        }
        return answer;
    }
}