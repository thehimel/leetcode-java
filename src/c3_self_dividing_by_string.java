public class c3_self_dividing_by_string {
    public static boolean isSelfDividing(int n) {
        //Convert the number to a string.
        String num = Integer.toString(n);
        //Divide the number by each digits of the number.
        for (int i = 0; i < num.length(); i++) {
            int m = Integer.parseInt(String.valueOf(num.charAt(i)));

            //If the digit is 0 or the number is not divisible by the digit, return false.
            if (m == 0 || n % m != 0) {
                return false;
            }
        }
        //Else, return true
        return true;
    }
    public static void main(String[] args){
        System.out.println(isSelfDividing(128));
    }
}
