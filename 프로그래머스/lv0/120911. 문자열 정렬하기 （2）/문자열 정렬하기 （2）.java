import java.util.*;
class Solution {
    public String solution(String str) {
        str = str.toLowerCase();
		String s_arr[] = str.split("");
		Arrays.sort(s_arr);
		String answer = "";
		for(int i = 0; i<s_arr.length; i++) {
			answer+=s_arr[i];
		}
        return answer;
    }
}