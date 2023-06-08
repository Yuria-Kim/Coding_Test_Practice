class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String n ="";
        for(int i = 0; i<array.length; i++){
            n+=""+array[i];
        }
        for(int i = 0; i<n.length(); i++){
            if(n.substring(i,i+1).equals("7")){
                answer++;
            }
        }
        return answer;
    }
}