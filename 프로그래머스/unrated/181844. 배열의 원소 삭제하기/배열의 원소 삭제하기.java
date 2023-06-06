import java.util.*;
import java.util.stream.IntStream;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> intlist = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            
            if (!IntStream.of(delete_list).anyMatch(x -> x == num)) {
                intlist.add(num);
            }
        }

        int[] answer = new int[intlist.size()];
        for(int i = 0; i<answer.length; i++){
            answer[i] = intlist.get(i);
        }
        return answer;
    }
}