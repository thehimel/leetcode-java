/*
TC: O(n). While loop runs n times.
SC: O(n). A new array is created depending on the size of the input array.

Runtime: 1 ms, faster than 100.00% of Java online submissions for Squares of a Sorted Array.
Memory Usage: 40.5 MB, less than 96.34% of Java online submissions for Squares of a Sorted Array.
 */
public class aa_lc_s12_q977_Squares_of_a_Sorted_Array3 {
    public static int[] sortedSquares(int[] A) {
        /*
        Notice, the input array is sorted. A = {-7,-3,2,3,11}. Negative numbers are one the left and positive numbers
        are on the right. neg is the left counter for negative numbers and pos is the right counter for positive numbers.
        So, we compare the square of the left most element with the square of the right most element and the larger
        element is moved to the result array. neg moves forward and pos moves backward depending on the situation.
        counter is decremented after each action and goes till counter is 0.
         */
        int size = A.length;
        int neg = 0, pos = size - 1, counter = size - 1;
        int[] res = new int[size];
        while (counter >= 0) {
            if (A[neg] * A[neg] > A[pos] * A[pos]) {
                res[counter] = A[neg] * A[neg];
                neg++;
            } else {
                res[counter] = A[pos] * A[pos];
                pos--;
            }
            counter--;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] A = {-7,-3,2,3,11};
        A = sortedSquares(A);
        for (int value : A) {
            System.out.print(value + " ");
        }
    }
}
