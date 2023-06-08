import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        List<String> an = new ArrayList<>();
        for(int i = 0; i<strArr.length; i++){
            int temp = strArr[i].indexOf("ad");
            if(temp<0){
                an.add(strArr[i]);
            }
        }
        String answer[] = new String[an.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = an.get(i);
        }
        return answer;
    }
}