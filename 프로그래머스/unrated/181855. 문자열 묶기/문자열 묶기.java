class Solution {
    public int solution(String[] strArr) {
        
        int cnt [] = new int [31];
        for(int i = 0; i<strArr.length; i++){
            int temp = strArr[i].length();
            cnt[temp]++;
        }
        int answer = 0;
        for(int i = 1; i<cnt.length; i++){
            if(cnt[i]>answer){
                answer = cnt[i];
            }
        }
        return answer;
    }
}