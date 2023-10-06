import java.util.Scanner;
public class GCD{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long output = gcd(scn.nextLong(), scn.nextLong());
        System.out.println(output );
    }
public static long gcd(long number1,long number2){
if(number1%number2==0){
return number2;
}
else{
return gcd(number2,number1%number2);
}
}



    
}