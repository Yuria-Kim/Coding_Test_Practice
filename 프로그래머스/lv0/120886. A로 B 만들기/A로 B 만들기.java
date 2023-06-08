import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String before, String after) {
        Map<Character, Integer> beforeCount = new HashMap<>();
        
        // before 문자열에서 알파벳 갯수 세기
        for (char c : before.toCharArray()) {
            beforeCount.put(c, beforeCount.getOrDefault(c, 0) + 1);
        }
        
        // after 문자열에서 알파벳 갯수 확인
        for (char c : after.toCharArray()) {
            if (!beforeCount.containsKey(c) || beforeCount.get(c) == 0) {
                return 0;
            }
            beforeCount.put(c, beforeCount.get(c) - 1);
        }
        
        return 1;
    }
}
