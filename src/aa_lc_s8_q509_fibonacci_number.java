/*
509. Fibonacci Number
https://leetcode.com/problems/fibonacci-number/

The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
Fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21,...
               N = 0, 1, 2, 3, 4, 5, 6, 7, 8,....
               F(0)=0, F(1)=1; F(2)=1, F(3)=2,....., F(8)=21,....

F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), for N > 1.
Given N, calculate F(N).

Example 1:
Input: 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

Example 2:
Input: 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.

Example 3:
Input: 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.

Note:
0 ≤ N ≤ 30.
 */

/*
Approach 1: Math
Intuition: Using the golden ratio, a.k.a Binet's forumula.
golden ratio = Phi = φ = (1+ √5)/2 ≈ 1.6180339887....
f(N) = (φ^N)/√5 = {((1+ √5)/2)^N}/√5
 */

/*
Complexity Analysis
Time complexity : O(1). Constant time complexity since we are using no loops or recursion and
the time is based on the result of performing the calculation using Binet's formula.
Space complexity : O(1). The space used is the space needed to create the variable to store the golden ratio formula.
 */
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
Memory Usage: 32.9 MB, less than 5.51% of Java online submissions for Fibonacci Number.
 */

/*
Approach 2: Recursion
Intuition: Use recursion to compute the Fibonacci number of a given integer.
Algorithm

Check if the provided input value, N, is less than or equal to 1. If true, return N.

Otherwise, the function fib(int N) calls itself, with the result of the 2 previous numbers being added to each other,
passed in as the argument. This is derived directly from the recurrence relation: F(n) = F_(n-1) + F_(n-2)

Do this until all numbers have been computed, then return the resulting answer.
 */

/*
Complexity Analysis:
Time complexity : O(2^N). This is the slowest way to solve the Fibonacci Sequence because it takes exponential time.
The amount of operations needed, for each level of recursion, grows exponentially as the depth approaches N.

Space complexity : O(N). We need space proportionate to N to account for the max size of the stack, in memory.
This stack keeps track of the function calls to fib(N).
This has the potential to be bad in cases that there isn't enough physical memory to handle the increasingly growing stack,
leading to a StackOverflowError. The Java docs have a good explanation of this,
describing it as an error that occurs because an application performs recursion too deeply.
 */
/*
Runtime: 9 ms, faster than 26.46% of Java online submissions for Fibonacci Number.
Memory Usage: 32.8 MB, less than 5.51% of Java online submissions for Fibonacci Number.
 */

/*
Approach 3: Iterative Top-Down Approach (Best)
Intuition:
Let's get rid of the need to use all of that space and instead use the minimum amount of space required.
We can achieve O(1) space complexity by only storing the value of the two previous numbers and updating them as we iterate to N.

Algorithm:
Check if N <= 1, if it is then we should return N.
Check if N == 2, if it is then we should return 1 since N is 2 and fib(2-1) + fib(2-2) equals 1 + 0 = 1.
To use an iterative approach, we need at least 3 variables to store each state fib(N), fib(N-1) and fib(N-2).
Preset the initial values:
Initialize current with 0.
Initialize prev1 with 1, since this will represent fib(N-1) when computing the current value.
Initialize prev2 with 1, since this will represent fib(N-2) when computing the current value.
Iterate, incrementally by 1, all the way up to and including N. Starting at 3, since 0, 1 and 2 are pre-computed.
Set the current value to fib(N-1) + fib(N-2) because that is the value we are currently computing.
Set the prev2 value to fib(N-1).
Set the prev1 value to current_value.
When we reach N+1, we will exit the loop and return the previously set current value.
 */
/*
Complexity Analysis

Time complexity : O(N). Each value from 2 to N will be visited at least once.
The time it takes to do this is directly proportionate to N where N is the Fibonacci Number we are looking to compute.

Space complexity : O(1). This requires 1 unit of Space for the integer N and 3 units of Space
to store the computed values (curr, prev1 and prev2) for every loop iteration.
The amount of Space doesn't change so this is constant Space complexity.
 */
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
Memory Usage: 33.1 MB, less than 5.51% of Java online submissions for Fibonacci Number.
 */
public class aa_lc_s8_q509_fibonacci_number {
    //Fibonacci by math
    public static int fib1(int N) {
        double goldenRatio = (1 + Math.sqrt(5)) / 2;
        return (int)Math.round(Math.pow(goldenRatio, N)/ Math.sqrt(5));
    }

    //Fibonacci by recursion
    public static int fib2(int N) {
        if (N <= 1) {
            return N;
        }
        return fib2(N-1) + fib2(N-2);
    }

    //Fibonacci by iterative top-down approach
    public static int fib3(int N) {
        if (N <= 1) {
            return N;
        }
        if (N == 2) {
            return 1;
        }

        int current = 0;
        int prev1 = 1;
        int prev2 = 1;

        for (int i = 3; i <= N; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return current;
    }

    public static void main(String[] args){
        int N=8;
        System.out.println(fib1(N));
        System.out.println(fib2(N));
        System.out.println(fib3(N));
    }
}
