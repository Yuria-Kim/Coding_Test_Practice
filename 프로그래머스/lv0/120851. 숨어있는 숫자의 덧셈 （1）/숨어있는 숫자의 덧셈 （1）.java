class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String intstr = my_string.replaceAll("[A-z]", "");
        char sc;
        for (int i = 0; i<intstr.length(); i++){
            sc = intstr.charAt(i);
            answer += Character.getNumericValue(sc);
        }
        return answer;
    }
}