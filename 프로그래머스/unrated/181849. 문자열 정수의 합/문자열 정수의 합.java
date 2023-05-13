class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for (int i = 0; i<num_str.length(); i++){
            char n1 = num_str.charAt(i);
            int n2 = Character.getNumericValue(n1);
            answer += n2;
        }
        
        return answer;
    }
}