class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int a = arr1.length;
        int b = arr2.length;
        if(a!=b){
            answer = (a>b)?1:-1;
        }
        else if(a==b){
            int stemp1 = 0;
            int stemp2 = 0;
            for(int i = 0; i<a; i++){
                stemp1 += arr1[i];
                stemp2 += arr2[i];
            }
            if(stemp1>stemp2){
                answer = 1;
            }
            else if (stemp2>stemp1){
                answer = -1;
            }
            else{
                answer = 0;
            }
        }
        return answer;
    }
}