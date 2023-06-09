class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int max = 0; // 가장 긴 문자열 찾을 길이
        int index = 0; // 마지막 index
        int tempi = 0; // 잘라낸 문자열 길이
        for(int i = 1; i<=myString.length(); i++){
            String temp = myString.substring(0,i);
            if (temp.endsWith(pat)){
                tempi = temp.length();
                if(tempi>max){
                    max = tempi;
                    index = i;
                }
            }   
        }
        answer = myString.substring(0,index);
        
        return answer;
    }
}