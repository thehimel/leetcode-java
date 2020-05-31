/*
1281. Subtract the Product and Sum of Digits of an Integer
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

Given an integer number n, return the difference between the product of its digits and the sum of its digits.

Example 1:
Input: n = 234
Output: 15
Explanation:
Product of digits = 2 * 3 * 4 = 24
Sum of digits = 2 + 3 + 4 = 9
Result = 24 - 9 = 15

Example 2:
Input: n = 4421
Output: 21
Explanation:
Product of digits = 4 * 4 * 2 * 1 = 32
Sum of digits = 4 + 4 + 2 + 1 = 11
Result = 32 - 11 = 21

Constraints:
1 <= n <= 10^5

Complexity
----------
TC: O(1). There is not for loop. The while loop only takes place for calculating on number
SC: O(1).

Feedback
--------
Runtime: 0 ms, faster than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
Memory Usage: 33.2 MB, less than 100.00% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
 */
public class aa_lc_s9_1281_subtract_the_product_and_sum_of_digits {
    public static int subtractProductAndSum(int n) {
        int product=1, sum=0;
        int temp = n;

        /*
        If we divide a number by 10, the reminder is the last digit of the number.
        if we divide a number by 10, the quotient is the one digit less than the dividend.
        We should perform the task till the number>0.
         */
        while(temp>0){
            //Get the digit
            int digit = temp%10;
            //Multiply the digit with the product
            product*=digit;
            //Add the digit to the sum
            sum+=digit;
            //System.out.println(product + " " + sum);
            temp/=10;
        }
        return product-sum;
    }
    public static void main(String[] args){
        System.out.println(subtractProductAndSum(234));
    }
}
