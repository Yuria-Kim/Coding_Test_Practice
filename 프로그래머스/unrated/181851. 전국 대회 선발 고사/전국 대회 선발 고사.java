class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        //1등부터 rank의 index를 담을 배열
        int index[] = new int[rank.length];
        //출전이 가능한 최종 학생 3명의 번호를 담을 배열
		int fin[] = new int[3];
        //각 석차의 학생번호 입력
		for(int i = 0; i<rank.length; i++) {
			index[rank[i]-1] = i;
		}
		int temp = 0;
        //참석가능 학생번호 등수로 3명 cut!
		for(int i = 0; i<index.length; i++) {
			if(attendance[index[i]]==true) {
				fin[temp] = index[i];
				temp++;
				if(temp==fin.length) break;
			}
		}
		int answer = (10000 * fin[0]) + (100 * fin[1]) + fin[2];
        
        return answer;
    }
}