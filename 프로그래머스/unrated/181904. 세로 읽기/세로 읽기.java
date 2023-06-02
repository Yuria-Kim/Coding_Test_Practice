class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        String a_arr[][] = new String [my_string.length()/m][m];
        int cnt = 0;
        for(int i = 0; i<a_arr.length; i++){
            for(int j = 0; j<a_arr[i].length; j++){
                if(cnt == my_string.length()){
                    break;
                }
                a_arr[i][j] = my_string.substring(cnt, cnt+1);
                cnt++;
            }
        }
        for(int i = 0; i<a_arr.length; i++){
            answer += a_arr[i][c-1];
        }
        
        return answer;
    }
}