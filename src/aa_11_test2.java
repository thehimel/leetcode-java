public class aa_11_test2 {
    public static int sumSomeValues (int [] array, int value)
    {
        if(array.length==0){
            return 0;
        }
        int sum=0;
        for(int i=0; i<array.length; i++) {
            if (array[i] % value == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int [] array = {1,3};
        int value = 2;
        int sum = sumSomeValues (array, value);
        System.out.println(sum);
    }
}
