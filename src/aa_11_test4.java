public class aa_11_test4 {
        public static void fillArray(int[] arr, int start, int factor){

        if(arr.length>0){
            arr[arr.length-1]=start;

            for(int i=arr.length-2; i>=0; i--){
                arr[i]=arr[i+1]*factor;
                System.out.print(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        int [] arr = new int[5];
        int start = 2;
        int factor = 2;
        fillArray(arr, start, factor);
    }
}
