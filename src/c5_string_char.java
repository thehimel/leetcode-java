//Transform characters in the 0-25 number system
public class c5_string_char {
    public static void main(String[] args){
        char one = 'k';
        char two = 'b';
        System.out.println(findMax(one, two));

        String[] s = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        //printing character as a number from 0 to 25
        //Suppose numeric value of a = 10, and c = 12. So to convert c in a system of 0-25 we do 12-10.
        int n = Character.getNumericValue(s[0].charAt(1))-Character.getNumericValue('a');
        System.out.println(n);
        //easy method
        n = s[0].charAt(1) - 'a';
        System.out.println(n);

    }
    public static char findMax(char one, char two){
        if(one>two){
            return one;
        }
        else{
            return two;
        }
    }
}
