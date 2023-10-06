import java.util.Scanner;
import java.math.BigInteger;
public class Fibonacci{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        fibonacci2(scn.nextInt());
    }
    public static void fibonacci2(int n){
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
        System.out.println(fibonacciArray[n]);  
}
    
}