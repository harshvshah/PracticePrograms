package leetcode;

public class PeakIndexMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        if(A == null || A.length == 0){
            return -1;
        }
        int i = 0;

        while( A[i] < A[i+1] ){
            i++;
        }
        return i;
    }
}
