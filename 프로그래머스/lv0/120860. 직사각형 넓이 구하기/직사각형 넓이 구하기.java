class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        //x중 제일 큰수, 작은수 -> 큰수 - 작은 수 
        //y 중 제일 큰수, 작은수 -> 큰수 - 작은 수
        int w_max = Integer.MIN_VALUE, w_min = Integer.MAX_VALUE;
        int h_max = Integer.MIN_VALUE, h_min = Integer.MAX_VALUE;
        for (int i = 0; i < dots.length; i++) {
            for (int j = 0; j < dots[i].length; j++) {
                if (j == 0) { // x 좌표의 경우
                    w_max = Math.max(w_max, dots[i][j]);
                    w_min = Math.min(w_min, dots[i][j]);
                } else if (j == 1) { // y 좌표의 경우
                    h_max = Math.max(h_max, dots[i][j]);
                    h_min = Math.min(h_min, dots[i][j]);
                }
            }
        }
        int width = w_max - w_min;
        int hight = h_max - h_min;
        answer = width * hight;
        return answer;
    }
}