package leetcode;

public class SortByParity {

    public int[] sortArrayByParity(int[] A) {
        if(A == null || A.length == 0){
            return null;
        }
        int j = 0;
        int[] returnArray = new int[A.length];
        int left = 0;
        int right = A.length - 1;

        while (left <= right){
            if(A[j] % 2 == 0){
                returnArray[left++] = A[j++];
            } else{
                returnArray[right--] = A[j++];
            }

        }

        return returnArray;
    }
}
