class Solution {
    public int solution(int n, int k) {
        int answer = (12000*n)+(2000*k);
        if (n>=10){
            int discount = (n/10)*2000;
            answer = answer - discount;
        }
        return answer;
    }
} 