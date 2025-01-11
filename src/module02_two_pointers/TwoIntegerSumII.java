package module02_two_pointers;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Integer Sum II
 *
 * @author created by sunjy on 1/8/25
 */
public class TwoIntegerSumII {

    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        return null;
    }

}
