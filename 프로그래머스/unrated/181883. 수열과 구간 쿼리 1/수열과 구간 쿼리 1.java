import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] q) {
        for(int i = 0; i<q.length; i++) {
			int from = q[i][0];
			int to = q[i][1];
			for(int j = from; j<=to; j++) {
				arr[j]++;
			}
		}
        return arr;
    }
}