class Solution {
    public int[] solution(String my_string) {
        
        String al = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String alpha[] = al.split("");
        int[] answer = new int [alpha.length];
        
        for (int i = 0; i<my_string.length(); i++){
            for(int j = 0; j<alpha.length; j++){
                if(my_string.substring(i, i+1).equals(alpha[j])){
                    answer[j]++;
                }
            }
        }
        return answer;
    }
}