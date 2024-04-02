package Com.junitprogramm;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringEqualityTest {

    private String strOne;
    private String strTwo;

    @Test
    public void testStringsEquality() {
        strOne = "hello";
        strTwo = "ehlol";

        assertTrue(areEqual(strOne, strTwo));
    }

    private boolean areEqual(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count characters in first string
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
        }

        // Decrease count of characters in second string
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i)]--;
            if (charCount[str2.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }
}

