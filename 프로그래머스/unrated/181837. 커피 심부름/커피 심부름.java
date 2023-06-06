class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i = 0; i<order.length; i++) {
			answer = order[i].contains("latte")? answer+5000 : answer+4500; 
		}
        return answer;
    }
}