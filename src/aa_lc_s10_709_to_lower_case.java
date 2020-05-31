/*
709. To Lower Case
Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.

Example 1:
Input: "Hello"
Output: "hello"

//With built-in function
TC: O(1).
SC: O(1).
Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
Memory Usage: 34.2 MB, less than 98.70% of Java online submissions for To Lower Case.

//With StringBuilder and With toCharArray()
TC: O(n).
SC: O(n).
Runtime: 0 ms, faster than 100.00% of Java online submissions for To Lower Case.
Memory Usage: 33.9 MB, less than 98.70% of Java online submissions for To Lower Case.
 */

public class aa_lc_s10_709_to_lower_case {

    //With built-in function
    public static String toLowerCase(String str) {
        return str.toLowerCase();
    }

    //With StringBuilder
    public static String toLowerCase2(String str) {
        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90){
                char c = (char)(str.charAt(i)+32);
                sb.setCharAt(i, c);
            }
        }
        str = sb.toString();
        return str;
    }

    //With toCharArray()
    public static String toLowerCase3(String str) {
        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=65 && arr[i]<=90){
                arr[i] = (char)(arr[i]+32);
            }
        }
        str = new String(arr);
        return str;
    }

    public static void main(String[] args){
        String str = "HELLO";
        System.out.println(toLowerCase(str));
        System.out.println(toLowerCase2(str));
        System.out.println(toLowerCase3(str));
    }
}
