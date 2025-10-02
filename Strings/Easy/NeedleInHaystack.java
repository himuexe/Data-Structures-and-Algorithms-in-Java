public class NeedleInHaystack {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty())
            return 0;
        int n = haystack.length(), m = needle.length();
        if (m > n)
            return -1;
        for (int i = 0; i <= n - m; i++) {
            String str = haystack.substring(i, i + m);
            if (str.equals(needle))
                return i;
        }
        return -1;
    }
}