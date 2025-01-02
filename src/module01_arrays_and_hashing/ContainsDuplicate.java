package module01_arrays_and_hashing;

import java.util.HashSet;

/**
 * Contains Duplicate
 *
 * @author created by sunjy on 1/1/25
 */
public class ContainsDuplicate {

    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            if (hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }
        return false;
    }

}
