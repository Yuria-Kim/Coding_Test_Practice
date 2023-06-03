import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        //값이 2인 인덱스 번호
        int cnt = 0;
        int k = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 2){
                k = i;
                cnt++;
            }
        }
        if(cnt==0){
            int answer [] = {-1};
            return answer;
        }
        else if(cnt==1){
            int answer [] = {arr[k]};
            return answer;
        }
        int temp[] = new int[cnt];
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 2){
                temp[j] = i;
                j++;
            }
        }
        
        Arrays.sort(temp);

        List<Integer>a_list = new ArrayList<>();
        
        for(int i = temp[0]; i<=temp[temp.length-1]; i++){
            a_list.add(arr[i]);
        }
        int answer[] = new int[a_list.size()];
        for(int i = 0; i<a_list.size(); i++){
            answer[i] = a_list.get(i);
        }
        return answer;
    }
}