class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char my_char[] = new char[index_list.length];
        for (int i = 0; i < index_list.length; i++){
            int j = index_list[i];
            my_char[i] = my_string.charAt(j);
            answer += my_char[i];
        }
        return answer;
    }
}