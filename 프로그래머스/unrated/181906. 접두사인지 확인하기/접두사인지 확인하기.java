class Solution {
    public int solution(String my_string, String is_prefix) {
        int index = my_string.indexOf(is_prefix);
        int answer = index==0?1:0;
        return answer;
    }
}