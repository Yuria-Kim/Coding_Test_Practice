class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        for(int i = a; i<=b; i++){
            String temp = String.valueOf(i);
            for(int j = 0; j<temp.length(); j++){
                if(temp.substring(j,j+1).equals(String.valueOf(c))){
                    answer++;
                }
            }
        }
        return answer;
    }
}