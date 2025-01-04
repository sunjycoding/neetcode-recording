package module01_arrays_and_hashing;

import java.util.ArrayList;
import java.util.List;

/**
 * Encode and Decode Strings
 *
 * @author created by sunjy on 1/4/25
 */
public class EncodeDecodeStrings {

    private static final String DELIMITER = "\u0001";

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append(DELIMITER).append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int delimiterIndex = str.indexOf(DELIMITER, i);
            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            String extractedString = str.substring(delimiterIndex + 1, delimiterIndex + 1 + length);
            decodedStrings.add(extractedString);
            i = delimiterIndex + 1 + length;
        }

        return decodedStrings;
    }

}
