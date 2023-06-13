class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        String d1 = "";
        String d2 = "";
        for(int i = 0; i<date1.length; i++) {
            d1 += ""+date1[i];
            d2 += ""+date2[i];
		}
        int result = Integer.valueOf(d1)-Integer.valueOf(d2);
        answer = (result>=0)?0:1;
        return answer;
    }
}