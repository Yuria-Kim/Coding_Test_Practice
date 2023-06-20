class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        //절대값 가져오고 부호 추가 and 연산
        for(int i = 0; i<absolutes.length; i++){
            answer = (signs[i] == true)? answer+absolutes[i]: answer-absolutes[i];
        }
        return answer;
    }
}