class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] == 1){
                    for(int k = i-1; k<=i+1; k++){
                        for(int t = j-1; t <= j+1; t++){
                            if(k<0 || t<0){
                                continue;
                            }
                            if(k>board.length-1||t>board.length-1){
                                continue;
                            }
                            if(board[k][t]==1){
                                continue;
                            }
                            board[k][t] = 2;
                        }
                    }
                }
            }
        }
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j]==0){
                    answer++;
                }
            }
        }
        return answer;
    }
}