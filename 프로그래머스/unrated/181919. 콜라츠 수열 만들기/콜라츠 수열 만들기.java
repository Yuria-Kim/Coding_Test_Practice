import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> answer_list = new ArrayList<>();
		
		while(n != 1) {
			if (n%2==0){ //짝수일때
				answer_list.add(n);
				n = n/2;
			}
			else if (n%2 ==1){//홀수일때
				answer_list.add(n);
				n = 3*n+1;
			}
		}
		answer_list.add(n); //n이 1인경우 포함
        //int answer[] = answer_list.toArray();
        int[] answer = answer_list.stream()
        	.mapToInt(Integer::intValue)
            	.toArray();
        return answer;
    }
}