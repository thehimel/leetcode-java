/*
Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number,
also in sorted non-decreasing order.

Example 1:
Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]

Example 2:
Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]

Note:
1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A is sorted in non-decreasing order.

TC: O(n^2).
SC: O(n).

Runtime: 65 ms, faster than 5.73% of Java online submissions for Squares of a Sorted Array.
Memory Usage: 40.6 MB, less than 96.34% of Java online submissions for Squares of a Sorted Array.
 */

public class aa_lc_s12_q977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] A) {
        int[] B = new int[A.length];
        B[0]=A[0]*A[0];
        for(int i=1; i<A.length; i++){
            int sqr=A[i]*A[i];

            //Insertion sort
            int j;
            for(j=i; j>0 && B[j-1]>sqr; j--){
                B[j]=B[j-1];
            }
            B[j]=sqr;
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = {-7,-3,2,3,11};
        A = sortedSquares(A);
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
    }
}
