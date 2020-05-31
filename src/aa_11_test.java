public class aa_11_test {
    public static void insert0(int[] arr){
        if(arr.length>1){
            for(int i=0; i<arr.length-1; i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;

            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]);
            }
        }
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4};
        insert0(arr);
    }
}
