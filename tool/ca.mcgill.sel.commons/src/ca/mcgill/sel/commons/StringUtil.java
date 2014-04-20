package ca.mcgill.sel.commons;

/**
 * Helper class with convenient static methods for working with Strings.
 * 
 * @author mschoettle
 */
public final class StringUtil {

    /**
     * Creates a new instance of {@link StringUtil}.
     */
    private StringUtil() {
        // Suppress.
    }
    
    /**
     * Changes the first character of the given text to upper case.
     * 
     * @param text the text which should be capitalized.
     * @return the capitalized text.  
     */
    public static String toUpperCaseFirst(String text) {
        char[] charArray = text.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        return String.valueOf(charArray);
    }
    
    /**
     * Changes the first character of the given text to lower case.
     * 
     * @param text the text which should be modified
     * @return the result  
     */
    public static String toLowerCaseFirst(String text) {
        char[] charArray = text.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return String.valueOf(charArray);
    }
    
    /**
     * Changes the first character of all words in the given text to uppercase.
     * 
     * @param text the text to modify
     * @return the text with all words capitalized
     */
    public static String toUpperCaseFirstAll(String text) {
        StringBuilder result = new StringBuilder();
        
        String[] words = text.split("\\s");
        
        for (int i = 0; i < words.length; i++) {
            result.append(toUpperCaseFirst(words[i]));
            
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
    
}
