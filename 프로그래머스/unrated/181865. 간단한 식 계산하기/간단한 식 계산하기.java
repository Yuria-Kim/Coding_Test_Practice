class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String bi[] = binomial.split(" ");
        if(bi[1].equals("+")){
            answer = Integer.valueOf(bi[0])+Integer.valueOf(bi[2]);
        }
        else if(bi[1].equals("-")){
            answer = Integer.valueOf(bi[0])-Integer.valueOf(bi[2]);
        }
        else if(bi[1].equals("*")){
            answer = Integer.valueOf(bi[0])*Integer.valueOf(bi[2]);
        }
        return answer;
    }
}