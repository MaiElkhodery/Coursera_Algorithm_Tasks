import java.util.Scanner;
import java.math.BigInteger;
public class hugeFibonacciNumberModulo{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      hugeFibonacciNumberModulo(scn.nextInt(), scn.nextInt());
    }
    public static void hugeFibonacciNumberModulo(int n,int m){
        System.out.println(fibonacci2(n).mod(new BigInteger(m+"")));
    }

    public static BigInteger fibonacci2(int n){
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
        return fibonacciArray[n];
    }
}