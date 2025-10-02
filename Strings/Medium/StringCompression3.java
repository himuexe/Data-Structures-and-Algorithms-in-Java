public class StringCompression3 {
    public String compressedString(String word) {
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < word.length(); i++) {
            Integer count = 1;
            while (i < word.length() - 1 && word.charAt(i) == word.charAt(i + 1)) {
                i++;
                count++;
                if (count >= 9)
                    break;
            }
            str.append(count.toString());
            str.append(word.charAt(i));
        }
        return str.toString();
    }
}