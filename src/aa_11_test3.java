public class aa_11_test3 {
    public static double strangeSum(double[] x) {
        if(x.length==0){
            return 0;
        }
        double [] y = new double[x.length];

        double sum = x[0];

        for(int i=1; i<x.length; i++){
            double result=x[i-1]*x[i];
            sum+=result;
        }
        return sum;
    }
    public static void main(String[] args){
        double[]  x = {1,2,3,4};
        double sum = strangeSum(x);
        System.out.println(sum);
    }
}
