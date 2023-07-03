
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int max = 0; 
        int min2 = 0; 
        for (int i = 0; i < nums.size();i++ ){
            if (nums.get(i) > max){
                min2 = max; // min2 is going to be the second largest since it will equal max before the final i is compared. 
                max = nums.get(i); 
            } else if (nums.get(i)> min2){
                min2 = nums.get(i); 
            }
        }
        return max + min2;
    }
}