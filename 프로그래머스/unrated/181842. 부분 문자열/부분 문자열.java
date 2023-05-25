class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        int index = str2.indexOf(str1);
        
        if(index>=0){
            answer = 1;
        }
        else answer = 0;
        return answer;
    }
}