class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        for(int i = 0; i<dot.length; i++){
            if (dot[i]>0 && dot[i+1]>0){
                answer = 1;
                break;
            }
            else if (dot[i]<0 && dot[i+1]>0){
                answer = 2;
                break;
            }
            else if (dot[i]<0 && dot[i+1]<0){
                answer = 3;
                break;
            }
            else if (dot[i]>0 && dot[i+1]<0){
                answer = 4;
                break;
            }
        }
        return answer;
    }
}