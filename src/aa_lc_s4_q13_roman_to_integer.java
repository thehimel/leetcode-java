/*
13. Roman to Integer
https://leetcode.com/problems/roman-to-integer/

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.

Example 1:
Input: "III"
Output: 3

Example 2:
Input: "IV"
Output: 4

Example 3:
Input: "IX"
Output: 9

Example 4:
Input: "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 5:
Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class aa_lc_s4_q13_roman_to_integer {
    public static int romanToInt(String s) {
        List<Integer> number = new ArrayList<>();

        HashMap<String, Integer> m1 = new HashMap<>();
        m1.put("I", 1);
        m1.put("V", 5);
        m1.put("X", 10);
        m1.put("L", 50);
        m1.put("C", 100);
        m1.put("D", 500);
        m1.put("M", 1000);

        HashMap<String, Integer> m2 = new HashMap<>();
        m2.put("IV", 4);
        m2.put("IX", 9);
        m2.put("XL", 40);
        m2.put("XC", 90);
        m2.put("CD", 400);
        m2.put("CM", 900);

        for (Map.Entry m2Element : m2.entrySet()) {

            String key = (String)m2Element.getKey();
            int val = ((int)m2Element.getValue());

            /*
            If the input string s contains any key from HashMap m2, insert the corresponding value to List number.
            Remove the string from the input string.
             */
            if(s.contains(key)){
                number.add(val);
                s = s.replace(key,"");
            }
        }

        //Now we have the string without any element present in HashMap m2

        /*
        Traverse through the present string and compare each element with HashMap m1.
        Insert the value from the HashMap to the List number.
        Removing of element is not necessary.
         */
        for(int i=0; i<s.length(); i++){
            char element = s.charAt(i);
            String letter = Character.toString(element);

            if(m1.containsKey(letter)){
                int val = m1.get(letter);
                number.add(val);
            }
        }


        int sum=0;
        for (int i : number){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args){
        String s = "MCMXCVIII";
        int value = romanToInt(s);
        System.out.println(value);
    }
}
