/*
Create a function that can return the highest value of the array and return 0 if the array is empty.
 */

public class c1_max_value {
    public static int findMax( int [] arr) {
        if(arr.length == 0){
            return 0;
        }
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int [] a = {10,20,22,56,66,33,100,200,300,45,55,62,0};
        int max = findMax(a);
        System.out.println(max);
    }
}
