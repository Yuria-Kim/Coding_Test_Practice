class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0,s);
        for (int i = e; i>=s; i--){
            String temp = my_string.substring(i,i+1);
            answer += temp;
        }
        answer += my_string.substring(e+1);
        return answer;
    }
}