class Solution {
    public String solution(int age) {
        String answer = "";
        char[] alphabet = "abcdefghij".toCharArray();
        int number [] = {0,1,2,3,4,5,6,7,8,9};

        int age_arr[] = new int[(int)(Math.log10(age)+1)];

        for(int i = age_arr.length-1; i>=0; i--){
            age_arr[i] = age%10;
            age /= 10; 
        }
        for (int j = 0; j<age_arr.length; j++){
            for (int k = 0; k<number.length; k++){
                if(age_arr[j]==number[k]){
                    answer += alphabet[k];
                }
            } 
        }
        return answer;
    }
}