/*
Check whether a number is divisible by all its digits or not.
 */
public class c2_self_dividing {
    public static boolean isSelfDividing(int n) {
        //Take the number in a temporary variable
        int temp=n;
        //If we keep dividing, one the list division the temp will be zero. Thus we'll go till temp>0
        while(temp>0){
            //If we divide the temp by 10, the reminder will be the digit. E.g. 128%10=8
            int digit = temp%10;
            //If the digit is 0 return false
            //Or the number is not divisible by digit return false. E.g. 128%8=0
            if(digit == 0 || n%digit!=0){
                return false;
            }
            //Divide the temp by 10 to remove the last digit
            temp/=10;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isSelfDividing(102));
    }
}
