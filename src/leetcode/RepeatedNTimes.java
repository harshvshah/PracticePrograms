package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RepeatedNTimes {
    public int repeatedNTimes(int[] A) {
        if(A == null || A.length == 0){
            return -1;
        }
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i : A){
            if(hashMap.containsKey(i)){
                return i;
            }

            hashMap.put(i, 1);
        }
        return -1;
    }
}
