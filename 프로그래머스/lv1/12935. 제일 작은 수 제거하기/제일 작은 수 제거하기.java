import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[]answer = {-1};
            return answer;
        }
        
        int answer [] = new int[arr.length-1];
        int min = arr[0];
        int index = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                index = i;
                min = arr[i];
            }
        }
        int temp = 0;
        for(int i = 0; i<arr.length; i++){
            if (i==index){
                continue;
            }
            else{
                answer[temp] = arr[i];
                temp++;
            }
        }
        
        return answer;
    }
}