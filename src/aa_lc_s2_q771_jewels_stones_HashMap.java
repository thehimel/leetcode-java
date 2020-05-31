/*
Keep all jewels in a HashMap. Count the number of elements in the Stones presented in the HashMap.

Complexity:
TC: O(n)
SC: O(n)

Runtime: 1 ms, faster than 93.68% of Java online submissions for Jewels and Stones.
Memory Usage: 34.9 MB, less than 97.47% of Java online submissions for Jewels and Stones.
 */
import java.util.HashMap;

public class aa_lc_s2_q771_jewels_stones_HashMap {
    public static int numJewelsInStones(String J, String S) {
        int count = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<J.length(); i++){
            map.put(J.charAt(i), 0);
        }

        for(int i=0; i<S.length(); i++){
            if(map.containsKey(S.charAt(i))){
                count++;
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
