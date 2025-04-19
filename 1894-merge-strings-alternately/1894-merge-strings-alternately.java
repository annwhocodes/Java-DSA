class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder newString = new StringBuilder();
        int i = 0, j = 0;
        while (i < word1.length() && j < word2.length()) {
            newString.append(word1.charAt(i++));
            newString.append(word2.charAt(j++));
        }
        while (i < word1.length()) {
            newString.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            newString.append(word2.charAt(j++));
        }

        return newString.toString();
    }
}
