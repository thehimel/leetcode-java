/*
728. Self Dividing Numbers
https://leetcode.com/problems/self-dividing-numbers/

A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
Also, a self-dividing number is not allowed to contain the digit zero.
Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:
Input:
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]

Note:
The boundaries of each input argument are 1 <= left <= right <= 10000.
 */

/*
TC: O(n), where n = number of integers from left to right
SC: O(n), length of the output
 */

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Self Dividing Numbers.
Memory Usage: 33.7 MB, less than 33.33% of Java online submissions for Self Dividing Numbers.
 */

import java.util.LinkedList;
import java.util.List;

public class aa_lc_s7_q728_self_dividing_num {
    //Function to check whether the number is self dividing or not.
    public static boolean isSelfDividing(int n) {
        //Take the number in a temporary variable
        int temp=n;
        //If we keep dividing, one the list division the temp will be zero. Thus we'll go till temp>0
        while(temp>0){
            //If we divide the temp by 10, the reminder will be the digit. E.g. 128%10=8
            int digit = temp%10;
            //If the digit is 0 return false
            //Or the number is not divisible by digit return false. E.g. 128%8=0
            if(digit == 0 || n%digit!=0){
                return false;
            }
            //Divide the temp by 10 to remove the last digit
            temp/=10;
        }
        return true;
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        //Declare a LinkedList that will contain the numbers that are self dividing
        List<Integer> list = new LinkedList<>();

        //Check all the numbers from the left to right bound
        for(int n=left; n<=right; n++){
            //If the number is self dividing, add it in the LinkedList
            if(isSelfDividing(n)){
                list.add(n);
            }
        }
        return  list;
    }
    public static void main(String[] args){
        int left = 1;
        int right = 22;
        List<Integer> list = selfDividingNumbers(left, right);
        for(int value: list){
            System.out.print(value+" ");
        }
    }
}
