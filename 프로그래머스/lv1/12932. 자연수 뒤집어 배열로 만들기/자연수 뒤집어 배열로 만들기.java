class Solution {
    public int[] solution(long n) {
        
        int index = String.valueOf(n).length();
        int[] answer = new int[index];
        int i = 0;
        while(n>0){
            long temp = n%10;
            answer[i] = (int)temp;
            n /= 10;
            i++;
        }
        return answer;
    }
}