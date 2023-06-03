class Solution {
    public int[][] solution(int[][] arr) {
        int value = arr.length;
        int column = arr[0].length;
        
        int answer[][];
        
        if(value>column){
            answer = new int[value][value];
        }
        else if(value<column){
            answer = new int[column][column];
        }
        else {
            answer = new int[value][column];
        }
        
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}