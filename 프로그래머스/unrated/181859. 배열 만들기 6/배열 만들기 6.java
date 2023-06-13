import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer>list = new ArrayList<>();
		int i = 0;
		
		while(i<arr.length) {
			if(list.size()==0) {
				list.add(arr[i]);
				i++;
			}
			else if(list.size()>0) {
				if(list.get(list.size()-1)==arr[i]) {
					list.remove(list.size()-1);
					i++;
				}
				else {
					list.add(arr[i]);
					i++;
				}
			}
		}
		if(list.size()==0) {
			int answer[] = {-1};
			return answer;
		}
		int answer[] = new int[list.size()];
		for(int j = 0; j<answer.length; j++) {
			answer[j] = list.get(j);			
		}
        
        return answer;
    }
}