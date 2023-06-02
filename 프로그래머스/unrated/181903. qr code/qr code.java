class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        for(int i = 0; i<code.length(); i++){
            if(i%q == r){
                String temp = code.substring(i, i+1);
                answer+=temp;
            }
        }
        return answer;
    }
}