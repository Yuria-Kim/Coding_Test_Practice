class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int size_lr = board[0]/2;
		int size_ud = board[1]/2;
		int way[] = new int[2];
		
		for(String i : keyinput) {
			switch (i) {
				case "left":
					if(way[0] == -1*size_lr) {
						continue;
					}
					way[0]--;
					break;
				case "right":
					if(way[0] == size_lr) {
						continue;
					}
					way[0]++;
					break;
				case "up":
					if(way[1] == size_ud) {
						continue;
					}
					way[1]++;
					break;
				case "down":
					if(way[1] == -1*size_ud) {
						continue;
					}
					way[1]--;				
					break;
			}
		}
        return way;
    }
}