package module03_sliding_window;

/**
 * Permutation in String
 *
 * @author created by sunjy on 1/14/25
 */
public class PermutationString {

    public boolean checkInclusion(String s1, String s2) {
        int lengthS1 = s1.length();
        int lengthS2 = s2.length();
        if (lengthS1 > lengthS2) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i < lengthS1; i++) {
            count1[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < lengthS1; i++) {
            count2[s2.charAt(i) - 'a']++;
        }

        if (matches(count1, count2)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            count2[s2.charAt(i) - 'a']++;
            count2[s2.charAt(i - s1.length()) - 'a']--;

            if (matches(count1, count2)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] count1, int[] count2) {
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }
        return true;
    }

}
