package Basics.Easy;

import java.util.*;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int prev = 0, result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int value = roman.get(ch);
            if (value < prev)
                result -= value;
            else
                result += value;
            prev = value;
        }
        return result;
    }
}