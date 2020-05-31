/*
961. N-Repeated Element in Size 2N Array
https://leetcode.com/problems/n-repeated-element-in-size-2n-array/

In a array A of size 2N, there are N+1 unique elements, and exactly one of these elements is repeated N times.
Return the element repeated N times.

Example 1:
Input: [1,2,3,3]
Output: 3

Example 2:
Input: [2,1,2,5,3,2]
Output: 2

Example 3:
Input: [5,1,5,2,5,3,5,4]
Output: 5

Note:
4 <= A.length <= 10000
0 <= A[i] < 10000
A.length is even
 */

/*
Complexity Analysis:
Time Complexity: O(N), where NN is the length of A.
Space Complexity: O(N).
 */

/*
Runtime: 22 ms, faster than 18.49% of Java online submissions for N-Repeated Element in Size 2N Array.
Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for N-Repeated Element in Size 2N Array.
 */

import java.util.HashMap;
public class aa_lc_s6_q961_n_rep_elem_in_2n_array {
    public static int repeatedNTimes(int[] A) {

        //Create a HashMap to keep the distinct keys
        HashMap<Integer, Integer> map = new HashMap<>();

        //Determine the value of N
        int N = A.length/2;

        for(int i=0; i<A.length; i++){

            //If the array element is not present in the map, initialize the value to 1
            if(!map.containsKey(A[i])){
                map.put(A[i], 1);
            }

            //If the array element is present in the map, increment the corresponding value by 1
            else{
                map.put(A[i], map.get(A[i]) + 1);

                //If there exists any value equal to N, that's the output. Return it.
                if(map.get(A[i])==N){
                    return A[i];
                }
            }
        }

        throw null;
    }
    public static void main(String[] args){
        int[] A = {5,1,5,2,5,3,5,4};
        int output = repeatedNTimes(A);
        System.out.println(output);
    }
}
