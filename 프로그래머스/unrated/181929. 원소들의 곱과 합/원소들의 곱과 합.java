class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = num_list[0];
        int sum = num_list[0];
        for (int i = 1; i<num_list.length; i++){//int i : num_list
            sum += num_list[i]; //모든 원소의 합
        }
        for (int i = 1; i<num_list.length; i++){
            multi *= num_list[i]; // 모든 원소의 곱 
        }
        if (multi < sum*sum){
            answer = 1;
        }
        else{
            answer = 0;
        }
        return answer;
    }
}