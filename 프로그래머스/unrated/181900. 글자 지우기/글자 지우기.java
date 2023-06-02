class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        String s_arr[] = my_string.split("");
        int cnt[] = new int[my_string.length()];
        for(int i = 0; i<indices.length; i++){
            cnt[indices[i]]++;
        }
        for(int j = 0; j<cnt.length; j++){
            if(cnt[j] == 0){
                answer += s_arr[j];
            }
        }
        return answer;
    }
}