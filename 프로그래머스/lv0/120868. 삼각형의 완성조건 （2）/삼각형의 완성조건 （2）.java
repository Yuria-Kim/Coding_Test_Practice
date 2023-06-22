class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int index = (sides[0]>sides[1])?0:1;
        // 주어진 두 수중 큰 수와 인덱스 찾음
        int temp = sides[index];
        if(index == 0){
            while(sides[0]<sides[1]+temp){
                answer++;
                temp--;
            }  
        }
        else{
            while(sides[1]<sides[0]+temp){
                answer++;
                temp--;
            }
        }
        //2. sides의 두 원소의 합보다 작고 두 원소중 큰 수보다 큰 수가 긴변이라는 가정
        int sum = sides[0]+sides[1];
        for(int i = sides[index]+1; i<sum; i++){
            answer++;
        }
        return answer;
    }
}