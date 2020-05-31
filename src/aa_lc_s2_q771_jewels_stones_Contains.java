/*
Complexity:
TC: O(n)
SC: O(1)

Runtime: 1 ms, faster than 93.68% of Java online submissions for Jewels and Stones.
Memory Usage: 34.8 MB, less than 98.99% of Java online submissions for Jewels and Stones.
 */
public class aa_lc_s2_q771_jewels_stones_Contains {
    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for(int i=0; i<S.length(); i++){
            if(J.contains(Character.toString(S.charAt(i)))){
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
