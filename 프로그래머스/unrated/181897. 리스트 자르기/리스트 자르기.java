import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        List<Integer>temp = new ArrayList<>();
        switch(n){
            case 1:{
                for(int i =0; i<=slicer[1]; i++){
                    temp.add(num_list[i]);
                }
                answer = new int[temp.size()];
                for(int i = 0; i<temp.size(); i++){
                    answer[i] = temp.get(i);
                }
                break;
            }
            case 2:{
                for(int i =slicer[0]; i<num_list.length; i++){
                    temp.add(num_list[i]);
                }
                answer = new int[temp.size()];
                for(int i = 0; i<temp.size(); i++){
                    answer[i] = temp.get(i);
                }
                break;
            }
            case 3:{
                for(int i = slicer[0]; i<=slicer[1]; i++){
                    temp.add(num_list[i]);
                }
                answer = new int[temp.size()];
                for(int i = 0; i<temp.size(); i++){
                    answer[i] = temp.get(i);
                }
                break;
            }
            case 4:{
                int tempI = slicer[2];
                for(int i = slicer[0]; i<=slicer[1]; i+=tempI){
                    temp.add(num_list[i]);
                }
                answer = new int[temp.size()];
                for(int i = 0; i<temp.size(); i++){
                    answer[i] = temp.get(i);
                }
                break;
            }
        }
        return answer;
    }
}