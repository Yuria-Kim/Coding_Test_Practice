class Solution {
    public long solution(long n) {
        long answer = 0;
        double x = 0;
        int i = 0;
        while(true){
            double temp = Math.pow(i, 2);
            if(temp == n){
                x = i;
                break;
            }
            i++;
            if(i==Integer.MAX_VALUE){
                return answer = -1;
            }
        }
        answer = (long)Math.pow((x+1), 2);
        return answer;
    }
}