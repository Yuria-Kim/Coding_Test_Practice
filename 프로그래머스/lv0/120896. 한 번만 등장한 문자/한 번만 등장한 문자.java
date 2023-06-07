import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String s_arr[] = s.split("");
        Arrays.sort(s_arr);
        
        int cnt[] = new int[s_arr.length];
        for(int i = 0; i<s_arr.length; i++){
            for(int j = 0; j<s_arr.length; j++) {
	            if(s_arr[i].equals(s_arr[j])){
	                cnt[i]++;
	            }
            }
        }
        for(int i =0; i<cnt.length; i++){
            if(cnt[i] == 1){
                answer += s_arr[i];
            }
        }
        return answer;
    }
}