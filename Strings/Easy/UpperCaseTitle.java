class Solution {
    public String capitalizeTitle(String title) {
        if (title == null || title.isEmpty()) {
            return title;
        }

        String[] words = title.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() <= 2) {
                // Convert entire word to lowercase for short words
                result.append(word.toLowerCase());
            } else {
                // Capitalize first letter, lowercase the rest
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
            }
            
            // Add space between words (but not after the last word)
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}