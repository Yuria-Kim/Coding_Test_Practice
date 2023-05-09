class Solution {
    public int[] solution(int[] num_list) {
        int odd_cnt = 0; // 홀수
        int even_cnt = 0; // 짝수
        int[] answer = new int[2];
        for (int i = 0; i<num_list.length; i++){
            if (num_list[i] % 2 == 1){
                odd_cnt++;
            }
            else if (num_list[i] % 2 == 0){
                even_cnt++;
            }
        }
        answer[0] = even_cnt;
        answer[1] = odd_cnt;
        return answer;
    }
}