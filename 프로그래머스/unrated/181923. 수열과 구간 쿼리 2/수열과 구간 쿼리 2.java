import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int k = queries[i][2];
            
            // 쿼리 범위 내에서 k보다 크면서 가장 작은 값을 찾기 위해 부분 배열 생성
            int[] subArray = Arrays.copyOfRange(arr, start, end + 1);
            Arrays.sort(subArray);
            
            // k보다 크면서 가장 작은 값을 찾는다.
            int result = -1;
            for (int num : subArray) {
                if (num > k) {
                    result = num;
                    break;
                }
            }
            
            answer[i] = result;
        }
        
        return answer;
    }
}