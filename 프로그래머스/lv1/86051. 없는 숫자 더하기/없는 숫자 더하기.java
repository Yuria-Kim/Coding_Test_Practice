import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int compare[] = new int[10];
        Arrays.sort(numbers);
        for(int i = 0; i<numbers.length; i++){
            int temp = numbers[i];
            compare[temp]++;
        }
        for(int i = 0; i<compare.length; i++){
            if(compare[i] == 0){
                answer+=i;
            }
        }
        return answer;
    }
}