class Solution {
    public String solution(String myString) {
        String answer = "";
        //문자열 전부 소문자로 변경
        String lower = myString.toLowerCase();
        //한 문자씩 비교해서 'a'인경우 'A'로 변경
        for(int i =0; i<lower.length(); i++){
            if(lower.substring(i,i+1).equals("a")){
                answer += "A";
            }
            else
                answer += lower.substring(i,i+1);
        }
        return answer;
    }
}