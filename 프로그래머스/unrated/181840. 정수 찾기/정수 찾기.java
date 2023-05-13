import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list, int n) {
        int answer = 0;
        if(IntStream.of(num_list).anyMatch(x -> x == n)) {
	        answer = 1;
		}
		else {
			answer = 0;
		}
        return answer;
    }
}