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

public class c4_each_digit_hard {
    public static void main(String[] args){
        int[] a = {4382, 8, 530, 90, 88, 231, 11, 45, 677, 199};
        int max = findMax(a);
        int maxDigit = findMaxDigit(max);

        int place = 1;
        while(place<=maxDigit){
            for(int i=0; i<a.length; i++){
                int value = getNumber(a[i], maxDigit, place);
                System.out.print(value + " ");
            }
            System.out.println();
            place++;
        }
    }
    public static int getNumber(int n, int maxDigit, int place){
        /*
        1's position: place = 1, 10's position: place = 2, 100's position: place = 3
        Let the number is 0008 and we need the digit at place 3 which is 0 from 0(0)08.
        So if the number < 10 ^ (place-1), then we can return 0 directly without going further.
         */
        if(n<Math.pow(10, place-1)){
            return 0;
        }

        /*
        creating a temp array with the length of maxDigit.
        Let our max number is 8245, than the array will be a = {0, 0, 0, 0}
         */
        int[] array = new int[maxDigit];
        int j = 0; //index value in a[]
        //Keep pushing the remainder in the array. So, finally the array will be, a = {5, 4, 2, 8}
        while(n>0){
            array[j++] = n%10;
            n/=10;
        }
        //printArray(array);
        return array[place-1]; //the index starts from 0. So, we need to return place-1 index
    }
    public static int findMax(int[] a){
        int max = a[0];
        for(int value: a){
            if(value>max)
                max=value;
        }
        return max;
    }
    public static int findMaxDigit(int n){
        int digit = 0;
        while(n>0){
            digit++;
            n/=10;
        }
        return digit;
    }
    public static void printArray(int[] a){
        for(int value: a){
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
