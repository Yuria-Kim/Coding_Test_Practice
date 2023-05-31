import java.util.*;

// class Solution {
//     public int[] solution(String[] intStrs, int k, int s, int l) {
//         return Arrays.stream(intStrs).mapToInt(value -> Integer.parseInt(value.substring(s, s + l))).filter(value -> value > k).toArray();
//     }
// }

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answerList = new ArrayList<>();
        int rev[] = new int[intStrs.length];
        for(int i = 0; i<intStrs.length; i++){
            rev[i]= Integer.valueOf(intStrs[i].substring(s, s+l));
            if(rev[i]>k){
                answerList.add(rev[i]);
            }
        }
        
        // ArrayList를 배열로 변환
        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}
