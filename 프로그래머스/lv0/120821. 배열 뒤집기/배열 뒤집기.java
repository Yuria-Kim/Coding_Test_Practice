class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];//7(0~6)
        int j = num_list.length-1; //6
        for(int i = 0; i<num_list.length; i++){
            answer[i] = num_list[j]; //0, 6
            j--;
        }
        return answer;
    }
}