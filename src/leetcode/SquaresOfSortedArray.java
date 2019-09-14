package leetcode;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] A) {
        if(A == null ||A.length == 0){
            return null;
        }
        int[] finalAns = new int[A.length];

        for(int i = 0; i < A.length; i++){
            finalAns[i] = A[i]*A[i];
        }
        Arrays.sort(finalAns);
        return finalAns;
    }
}
