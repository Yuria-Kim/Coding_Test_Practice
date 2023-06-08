class Solution {
    public int solution(int num, int k) {
        String s = ""+num;
		int answer = 0;
        String s_arr[] = s.split("");
        int i_arr[] = new int[s_arr.length];
        for(int i = 0; i<s_arr.length; i++) {
        	i_arr[i] = Integer.valueOf(s_arr[i]);
        	if(i_arr[i] ==k) {
        		answer = i+1;
        		break;
        	}
        	else answer = -1;
        }
        return answer;
    }
}