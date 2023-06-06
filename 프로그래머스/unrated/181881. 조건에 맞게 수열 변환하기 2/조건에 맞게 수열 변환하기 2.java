import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int x = -1;
        int[] originalArr = Arrays.copyOf(arr, arr.length);
        
        while (true) {
            int[] newArr = performOperation(originalArr);
            x++;
            
            if (Arrays.equals(originalArr, newArr)) {
                break;
            }
            
            originalArr = Arrays.copyOf(newArr, newArr.length);
        }
        
        return x;
    }
    
    private int[] performOperation(int[] arr) {
        int[] newArr = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                newArr[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                newArr[i] = arr[i] * 2 + 1;
            } else {
                newArr[i] = arr[i];
            }
        }
        
        return newArr;
    }
}
