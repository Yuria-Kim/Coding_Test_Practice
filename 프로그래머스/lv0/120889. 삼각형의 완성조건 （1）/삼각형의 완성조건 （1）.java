class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        int max = 0;
        int index = 0;
        for(int i =0; i<sides.length; i++){
            if(sides[i]>max){
                max = sides[i];
                index = i;
            }
        }
        int sum = 0;
        for(int i = 0; i<sides.length; i++){
            if (i==index){
                continue;
            }
            sum += sides[i];
        }
        if(sum>max) answer = 1;
        return answer;
    }
}