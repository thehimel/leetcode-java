import java.util.Arrays;

/*
Complexity Analysis
-------------------
Time Complexity: O(nlogn), where n is the length of A.
Space Complexity: O(1).

Runtime: 2 ms, faster than 69.13% of Java online submissions for Squares of a Sorted Array.
Memory Usage: 40.4 MB, less than 98.17% of Java online submissions for Squares of a Sorted Array.
 */
public class aa_lc_s12_q977_Squares_of_a_Sorted_Array2 {
    public static int[] sortedSquares(int[] A) {
        for(int i=0; i<A.length; i++){
            A[i]=A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        int[] A = {-7,-3,2,3,11};
        A = sortedSquares(A);
        for (int value : A) {
            System.out.print(value + " ");
        }
    }
}
