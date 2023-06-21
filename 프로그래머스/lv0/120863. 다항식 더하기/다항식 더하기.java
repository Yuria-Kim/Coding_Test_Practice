import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        //+를 기준으로 split [3x, 7, x]
        //if contains(x) .length()>1 -> substring(0, length()-1):x앞의 정수
        //정수들끼리 더하고 x추가
        //not contains x들끼리 더하기
        int x_sum = 0;
        int i_sum = 0;
        String[] l = polynomial.split("\\+");
        for(String i : l){
            i = i.trim();
            if(i.contains("x")){
                if(i.length()>1){
                    String[] parts = i.split("x");
                    int coefficient = Integer.parseInt(parts[0]);
                    x_sum += coefficient;
                }
                else{
                    x_sum += 1;
                }
            }
            else{
                i_sum += Integer.valueOf(i);
            }
        }
        if(x_sum == 1 && i_sum<=0){
            answer = "x";
        }
        else if(x_sum == 1){
            answer = "x"+" + "+String.valueOf(i_sum);
        }
        
        else if(x_sum<1 && i_sum>0){
            answer = String.valueOf(i_sum);
        }
        else if(i_sum>0){
            answer = String.valueOf(x_sum)+"x"+" + "+String.valueOf(i_sum);
        }
        else{
            answer = String.valueOf(x_sum)+"x";
        }
        return answer;
    }
}