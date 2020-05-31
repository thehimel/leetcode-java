/*
URL: https://leetcode.com/problems/two-sum/

Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */

/*
Approach 2: Two-pass Hash Table
To improve our run time complexity, we need a more efficient way to check if the complement exists in the array.
If the complement exists, we need to look up its index.
What is the best way to maintain a mapping of each element in the array to its index? A hash table.

We reduce the look up time from O(n)O(n) to O(1)O(1) by trading space for speed.
A hash table is built exactly for this purpose, it supports fast look up in near constant time.
I say "near" because if a collision occurred, a look up could degenerate to O(n)O(n) time.
But look up in hash table should be amortized O(1)O(1) time as long as the hash function was chosen carefully.

A simple implementation uses two iterations. In the first iteration, we add each element's value and its index to the table.
Then, in the second iteration we check if each element's complement (target - nums[j]) exists in the table.
Beware that the complement must not be nums[j] itself!

If there is no solution return an empty array. And while printing, print the values if the array is not empty.
 */

/*
Complexity Analysis:
Time complexity : O(n). We traverse the list containing n elements exactly twice.
Since the hash table reduces the look up time to O(1), the time complexity is O(n).

Space complexity : O(n). The extra space required depends on the number of items stored in the hash table, which stores exactly n elements.
 */

import java.util.HashMap;

public class aa_lc_s1_q1_two_sum2 {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int j=0; j<nums.length; j++){
            int component = target - nums[j];
            if(map.containsKey(component) && map.get(component) !=j){
                return new int[] {j, map.get(component)};
            }
            return new int[0]; // else return an empty array.
        }
        throw new IllegalArgumentException("No two sum solution");

    }

    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 90;
        int[] result = twoSum(nums, target);

        if(result.length != 0){
            for(int value: result){
                System.out.print(value+" ");
            }
        }

        else{
            System.out.print("No solution");
        }
    }
}
