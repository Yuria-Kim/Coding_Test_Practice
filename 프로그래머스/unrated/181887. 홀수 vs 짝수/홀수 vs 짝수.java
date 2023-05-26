//가장 첫 번째 원소를 1번 원소라고 할 때, 홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return


class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0;
        int even = 0;
        for (int i = 0; i<num_list.length; i+=2){
            even += num_list[i];
        }
        for (int j = 1; j<num_list.length; j+=2){
            odd += num_list[j];
        }
        if (even > odd) answer = even;
        else if (odd > even) answer = odd;
        else answer = odd;
        
        return answer;
    }
}