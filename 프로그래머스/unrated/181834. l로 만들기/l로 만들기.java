class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i<myString.length(); i++){
            char temp = myString.charAt(i);
            if(temp<'l'){
                answer += "l";
            }
            else{
                answer += String.valueOf(temp);
            }
            
        }
        return answer;
    }
}