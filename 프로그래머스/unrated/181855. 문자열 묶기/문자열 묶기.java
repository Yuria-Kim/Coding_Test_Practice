import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        
        int cnt [] = new int [31];
        for(int i = 0; i<strArr.length; i++){
            cnt[strArr[i].length()]++;
        }
        int answer = 0;
        for(int i = 1; i<cnt.length; i++){
            answer = Math.max(answer, cnt[i]);
        }
        return answer;
    }
}