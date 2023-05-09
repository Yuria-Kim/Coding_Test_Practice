class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i<my_string.length(); i++){
            char rep = my_string.charAt(i);
            String rep_s = String.valueOf(rep);
            answer += rep_s.repeat(n);
        }
        return answer;
    }
}