class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] check = new int[included.length];
        check[0] = a;
        for (int i = 1; i<included.length; i++){
            check[i] = check[i-1]+d; 
        }
        for (int i = 0; i<included.length; i++){
            if (included[i] == true){
                answer += check[i];
            }
        }
        return answer;
    }
}