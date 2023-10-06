import java.util.Scanner;
import java.math.BigInteger;
public class LastDigit{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        lastDigitOfFibonacciNumber(scn.nextInt());
    }
    public static void lastDigitOfFibonacciNumber(int n){
        BigInteger[] fibonacciArray = new BigInteger[n+1];
        fibonacciArray[0]=BigInteger.ZERO;
        if(n>0){
            fibonacciArray[1]=BigInteger.ONE;
            int counter=2;
            while(counter<=n){
                fibonacciArray[counter]=fibonacciArray[counter-1].add(fibonacciArray[counter-2]);
                counter++;
            }
        }
        String fibonacci_last_digit = fibonacciArray[n].toString();
        System.out.println(fibonacci_last_digit.charAt(fibonacci_last_digit.length()-1));  
    }
    
}