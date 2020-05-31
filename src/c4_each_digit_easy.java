/*
You have an array of integers. Print digits of each decimal places for each item in the array.

input array a = {4382, 8, 530, 90, 88, 231, 11, 45, 677, 199};
For 4322, digit in 1's place = 2, digit in 10's place = 2,
digit in 100's place = 3, digit in 1000's place = 4.

Output: For every elements in the array, print digits in 1's place, 10's place, 100's place, etc.

Digits in 1's place:    2 8 0 0 8 1 1 5 7 9
Digits in 10's place:   8 0 3 9 8 3 1 4 7 9
Digits in 100's place:  3 0 5 0 0 2 0 0 6 1
Digits in 1000's place: 4 0 0 0 0 0 0 0 0 0

If the max value of the array is of 8 digits, print upto 1000 0000's place.
 */
public class c4_each_digit_easy {
    public static void main(String[] args){
        int[] a = {4382, 8, 530, 90, 88, 231, 11, 45, 677, 199};
        int max = findMax(a);
        for(int pos = 1; max/pos>0; pos*=10){
            for(int i=0; i<a.length; i++){
                printInt((a[i]/pos)%10);
            }
            System.out.println();
        }
    }
    public static int findMax(int[] a){
        int max = a[0];
        for(int value: a){
            if(value>max)
                max=value;
        }
        return max;
    }
    public static void printInt(int n){
        System.out.print(n + " ");
    }

    public static void printArray(int[] a){
        for(int value: a){
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
