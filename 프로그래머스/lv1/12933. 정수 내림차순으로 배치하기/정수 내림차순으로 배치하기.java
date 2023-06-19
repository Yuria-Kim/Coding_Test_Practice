import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String nn = String.valueOf(n);
        String[] arr = new String[nn.length()];
        for(int i = 0; i<arr.length; i++){
            arr[i] = nn.substring(i, i+1);
        }
        Arrays.sort(arr);
        String temp = "";
        for(int i = arr.length-1; i>=0; i--){
            temp += arr[i];
        }
        answer = Long.valueOf(temp);
        // int size = (int)(Math.log10(n)+1);
        // int arr[] = new int[size];
        // int i = 0;
        // while(n>0){
        //     arr[i] = (int)n%10;
        //     n /= 10;
        //     i++;
        // }
        // Arrays.sort(arr);
        // String temp = "";
        // for(int j = 0; j<arr.length; j++){
        //     temp += ""+arr[j];
        // }
        // answer = Long.valueOf(temp);
        return answer;
    }
}