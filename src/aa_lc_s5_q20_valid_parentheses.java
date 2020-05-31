/*
20. Valid Parentheses
https://leetcode.com/problems/valid-parentheses/

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:
Input: "()"
Output: true

Example 2:
Input: "()[]{}"
Output: true

Example 3:
Input: "(]"
Output: false

Example 4:
Input: "([)]"
Output: false

Example 5:
Input: "{[]}"
Output: true
 */

/*
Complexity analysis

Time complexity : O(n) because we simply traverse the given string one character at a time and push and
pop operations on a stack take O(1)O(1) time.

Space complexity : O(n) as we push all opening brackets onto the stack and in the worst case,
we will end up pushing all the brackets onto the stack. e.g. ((((((((((.
 */

/*
Runtime: 2 ms, faster than 57.12% of Java online submissions for Valid Parentheses.
Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Valid Parentheses.
 */

import java.util.HashMap;
import java.util.Stack;

public class aa_lc_s5_q20_valid_parentheses {
    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        //Create a stack to keep track of the brackets
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            //If the current character is a closing bracket
            if(map.containsKey(c)){
                //Get the topElement of the stack. If the stack is empty, get a dummy value
                Character topElement = stack.empty() ? '#' : stack.pop();

                //If the mapping of the bracket doesn't match the topElement, return false
                if(topElement != map.get(c)){
                    return false;
                }
            }

            //If the current character is not a closing bracket, push it in the stack
            else{
                stack.push(c);
            }
        }
        //If the stack is empty, return true. Else return false
        return stack.isEmpty();
    }

    public static void main(String[] args){
        boolean output = isValid("[()]");
        System.out.println(output);
    }
}
