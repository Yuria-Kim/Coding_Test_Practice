class Solution {
    public int solution(String number) {
        int in[] = new int [number.length()];
        int isum = 0;
        for (int i =0; i<in.length; i++){
            char cn = number.charAt(i);
            int in1 = Character.getNumericValue(cn);
            in[i] = in1;
            isum += in[i];
        }
        int answer = isum % 9;
        return answer;
    }
}