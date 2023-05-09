class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd[] = new int[num_list.length]; // 홀수
        int even[] = new int[num_list.length]; // 짝수
        for(int i =0; i<num_list.length; i++){
            if(num_list[i]%2==0){
                even[i] = num_list[i];
            }
            else{
                odd[i] = num_list[i];
            }
        }
        String odd_s[] = new String [odd.length];
        String odd_sum = "";
        for(int i =0; i<odd.length; i++){
            if (odd[i] > 0){
                odd_s[i] = String.valueOf(odd[i]);
                odd_sum += odd_s[i];
            }
        }
        String even_s[] = new String [even.length];
        String even_sum = "";
        for(int i =0; i<even.length; i++){
            if (even[i]>0) {
                even_s[i] = String.valueOf(even[i]);
                even_sum += even_s[i];
            }
        }
        answer = Integer.valueOf(odd_sum)+ Integer.valueOf(even_sum);
        return answer;
    }
}