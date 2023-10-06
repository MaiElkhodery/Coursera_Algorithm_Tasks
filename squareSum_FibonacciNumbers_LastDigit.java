import java.util.Scanner;
import java.math.BigInteger;
public class squareSum_FibonacciNumbers_LastDigit{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        squareSum_FibonacciNumbers_LastDigit(scn.nextInt());
    }

    public static void squareSum_FibonacciNumbers_LastDigit(int n){
        BigInteger[] fibonacciArray = arrayFibonacciNumber(n);
        BigInteger sumArray = new BigInteger("0");
        for(int i = 0; i<=n ; i++){
            sumArray=sumArray.add(fibonacciArray[i].multiply(fibonacciArray[i]));
        }
        String sum = sumArray.mod(new BigInteger("10")).toString();
        System.out.println(sum.charAt(sum.length()-1));
    }
        public static BigInteger[] arrayFibonacciNumber(int n){
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
        return fibonacciArray;
    }
    
}