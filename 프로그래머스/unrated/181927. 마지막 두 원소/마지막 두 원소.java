class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        for (int i = 0; i < num_list.length; i++){
            answer[i] = num_list[i];
            if (i == num_list.length-1){
                    if(answer[i] > answer[i-1]){
                        answer[i+1] = answer[i] - answer[i-1];
                    }
                    else if(answer[i] <= answer[i-1]){
                        answer[i+1] = answer[i] * 2;
                    }
            }
        }
        return answer;
    }
}