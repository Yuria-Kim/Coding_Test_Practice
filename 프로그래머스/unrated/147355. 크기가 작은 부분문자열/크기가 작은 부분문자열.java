class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int dep = p.length();
        long ip = Long.parseLong(p);
		for(int i = 0; i<=t.length()-dep; i++) {
			long temp = Long.parseLong(t.substring(i, i+dep));
			if(ip >= temp) {
				answer ++;
			}
			
		}
        return answer;
    }
}