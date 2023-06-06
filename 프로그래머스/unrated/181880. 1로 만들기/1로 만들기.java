class Solution {
    public int solution(int[] arr) {
        int cnt = 0;
		for(int i =0; i<arr.length; i++) {
			while(arr[i]!=1) {
				arr[i] = (arr[i]%2==0)?(arr[i]/2):(arr[i]-1)/2;
				cnt++;
			}
		}
        return cnt;
    }
}