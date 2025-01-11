package module03_sliding_window;

/**
 * Longest Repeating Character Replacement
 *
 * @author created by sunjy on 1/10/25
 */
public class LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26];
        int maxCount = 0;
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            charCount[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, charCount[s.charAt(right) - 'A']);

            while (right - left + 1 - maxCount > k) {
                charCount[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

}
