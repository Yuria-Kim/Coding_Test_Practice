class Solution {
    public String[] solution(String my_str, int n) {
        int in = (my_str.length()%n==0)?my_str.length()/n:my_str.length()/n+1;
        String[] answer = new String[in];
        int index=0;
        for(int i=0; i<my_str.length(); i+=n){
            if(i+n>my_str.length()){
                answer[index] = my_str.substring(i);
                break;
            }
            answer[index] = my_str.substring(i, i+n);
            index++;
        }
        return answer;
    }
}