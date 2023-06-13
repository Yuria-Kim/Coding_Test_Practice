import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int[] answer = new int[k];
        int index = 0;
        
        // 주어진 배열에서 중복되지 않는 숫자를 선택하여 배열에 추가
        for (int num : arr) {
            if (!set.contains(num)) {
                answer[index] = num;
                set.add(num);
                index++;
            }
            if (index >= k) {
                break;
            }
        }
        
        // 배열의 길이가 k보다 작을 경우 남은 공간을 -1로 채움
        while (index < k) {
            answer[index] = -1;
            index++;
        }
        
        return answer;
    }
}