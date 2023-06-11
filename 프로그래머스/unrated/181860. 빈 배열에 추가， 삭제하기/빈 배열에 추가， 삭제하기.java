import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer>an = new ArrayList<>();
        for(int i = 0; i<flag.length; i++){       
            if(flag[i]==true){
                for(int k = 0; k<arr[i]*2; k++){
                    an.add(arr[i]);
                }
            }
            else if(flag[i]==false){
                for (int k = 0; k < arr[i]; k++) {
                    if (!an.isEmpty()) {
                        an.remove(an.size() - 1);
                    }
                }   
            }
        }
        int answer[] = new int[an.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = an.get(i);
        }
        return answer;
    }
}