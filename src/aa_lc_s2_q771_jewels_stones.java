/*
771. Jewels and Stones
https://leetcode.com/problems/jewels-and-stones/

You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters.
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:
Input: J = "aA", S = "aAAbbbb"
Output: 3

Example 2:
Input: J = "z", S = "ZZ"
Output: 0
Note:
S and J will consist of letters and have length at most 50.
The characters in J are distinct.

Solution:
Compare each element of J with the each element of S. For each occurrence increment count by one.

Complexity Analysis:
Time complexity : O(n^2).
Space complexity : O(1) as it is an in-place method.

Runtime: 1 ms, faster than 94.17% of Java online submissions for Jewels and Stones.
Memory Usage: 34.8 MB, less than 100.00% of Java online submissions for Jewels and Stones.
 */

public class aa_lc_s2_q771_jewels_stones {
    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for(int i=0; i<S.length(); i++){
            for(int j=0; j<J.length(); j++){
                if(J.charAt(j)==S.charAt(i)){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewelsInStones(J,S));
    }
}
