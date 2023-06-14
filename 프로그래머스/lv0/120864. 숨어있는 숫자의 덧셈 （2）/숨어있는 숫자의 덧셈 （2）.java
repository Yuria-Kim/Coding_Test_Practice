class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[A-z]","_");
        String[] an = my_string.split("\\_+");
		int answer = 0;
		for(int i = 0; i<an.length; i++) {
			if (!an[i].isEmpty()) {
                answer += Integer.valueOf(an[i]);
            }
		}
        return answer;
    }
}