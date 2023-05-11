class Solution {
    public String solution(String n_str) {
        String answer = n_str;
        int i = 0;
        while(n_str.charAt(i) == '0'){
            answer = n_str.substring(i+1);
            if (n_str.charAt(i) != '0'){
                answer = n_str.substring(i);
                break;
            }i++;
        }
        return answer;
    }
}