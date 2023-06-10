import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer>an = new ArrayList<>();
        int cnt = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                an.add(arr[i]);
                cnt++;
            }
        }
        if(cnt == 0){
            int answer [] = {-1};
            return answer;
        }
        int answer[] = new int[an.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = an.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}