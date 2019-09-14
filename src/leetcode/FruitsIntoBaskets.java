package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FruitsIntoBaskets {
    public int totalFruit(int[] tree) {
        int len = tree.length;
        if(len == 0){
            return 0;
        }

        int max = 0;
        int j = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < len; i++){

            map.put(tree[i], map.getOrDefault(tree[i], 0) + 1);

            while(map.size() > 2){
                map.put(tree[j], map.get(tree[j])-1);

                if(map.get(tree[j])==0){
                    map.remove(tree[j]);
                }
                j++;
            }
            max = Math.max(max, i-j+1);
        }
        return max;
    }
}
