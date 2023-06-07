class Solution {
    public String solution(String str, int n, int m) {
        String answer = "";
        String s_arr [] = str.split("");
        String temp = s_arr[n];
        s_arr[n] = s_arr[m];
        s_arr[m] = temp;
        for(int i = 0; i<s_arr.length; i++) {
        	answer += s_arr[i];
        }
        return answer;
    }
}