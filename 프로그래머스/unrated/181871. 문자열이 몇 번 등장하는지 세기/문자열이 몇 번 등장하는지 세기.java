class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int dex = pat.length();
        for(int i = 0; i<myString.length(); i++){
            if(i+dex>myString.length()) break;
            String temp = myString.substring(i,i+dex);
            if(temp.equals(pat)){
                answer++;
            }
        }
        return answer;
    }
}