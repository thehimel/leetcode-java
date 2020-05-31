/*
905. Sort Array By Parity
https://leetcode.com/problems/sort-array-by-parity/

Given an array A of non-negative integers, return an array consisting of all the even elements of A,
followed by all the odd elements of A.
You may return any answer array that satisfies this condition.

Example 1:
Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Note:
1 <= A.length <= 5000
0 <= A[i] <= 5000
 */

/*
TC: O(n). Traverses each element only once depending of the size of the input array.
SC: O(n). Not an in-place method.
 */

/*
Runtime: 1 ms, faster than 100.00% of Java online submissions for Sort Array By Parity.
Memory Usage: 40.1 MB, less than 93.75% of Java online submissions for Sort Array By Parity.
 */

public class aa_lc_s3_q905_sort_array_by_parity {
    public static int[] sortArrayByParity(int[] A) {
        int[] B = new int[A.length]; //Let's create an array B that has the same size as array A

        /*
        We'll keep the even elements at the beginning of the array B.
        Thus take an integer even and initialize to 0 as it will insert the even elements in the front of the array B and
        it will be incremented by one after each successful even number insertion.
        Take another integer odd and initialize to A.length-1 as it will insert the odd element in the back of the array B and
        it will be decremented by one after each successful odd number insertion.
        B = {even++ ->, <- odd--}';
        B = {even, even, even, odd, odd, odd};
        */
        int even=0;
        int odd=A.length-1;

        for(int i=0; i<A.length; i++){
            if(A[i]%2==0){
                B[even++]=A[i];
            }
            else{
                B[odd--]=A[i];
            }
        }
        return B;
    }

    public static void main(String[] args){
        int[] A = {3,1,2,4};
        A = sortArrayByParity(A);
        for(int value:A){
            System.out.print(value+" ");
        }
    }
}
