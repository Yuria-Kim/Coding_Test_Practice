class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if ((a==b) && (b==c)) {
             answer = (a + b + c) * ((a*a) + (b*b) + (c*c)) * ((a*a*a) + (b*b*b) + (c*c*c));
        }
        else if (a == b) {
            if (b != c){
                answer = (a+b+c) * ((a*a) + (b*b) + (c*c));
            }
        }
        else if (b == c){
            if(a != c){
                answer = (a+b+c) * ((a*a) + (b*b) + (c*c));
            } 
        }
        else if (a == c){
            if (a != b){
                answer = (a+b+c) * ((a*a) + (b*b) + (c*c));
            }
        }
        else if ((a != b) && (a != c) && (b !=c)) {
            answer = a+b+c;
        }
        return answer;
    }
}