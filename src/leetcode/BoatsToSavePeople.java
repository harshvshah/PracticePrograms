package leetcode;

import java.util.Arrays;

public class BoatsToSavePeople {

    public int numRescueBoats(int[] people, int limit) {
        if(people == null || people.length == 0 || limit < 1){
            return 0;
        }
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int count = 0;

        while(left <= right){
            if(people[left] + people[right] <= limit){
                count++;
                left++;
                right--;
            } else {
                count++;
                right--;
            }

        }
        return count;
    }
}
