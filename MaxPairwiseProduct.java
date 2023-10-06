import java.util.Scanner;
import java.math.BigInteger;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberOfInputs = scn.nextInt();
        BigInteger[] intputArray = new BigInteger[numberOfInputs];

        for(int i =0; i<numberOfInputs; i++){
            intputArray[i]=scn.nextBigInteger();
        }
        System.out.println(maxPairwiseProduct(intputArray));
    }
    public static BigInteger maxPairwiseProduct(BigInteger[] inputArray){
    int maxIndex1 =0;
    int maxIndex2 =0;
    for(int index=1; index<inputArray.length; index++){
        if(inputArray[maxIndex1].compareTo(inputArray[index]) < 0 ){//9 5 1
            maxIndex1 = index;
        }
    }
    if(maxIndex1==0){maxIndex2=1;}
    for(int index=1; index<inputArray.length; index++){
        if(inputArray[maxIndex2].compareTo(inputArray[index]) < 0 && maxIndex1!=index){
            maxIndex2 = index;
        }
    }
    BigInteger result = inputArray[maxIndex1];
    result=result.multiply(inputArray[maxIndex2]);
    return result;
    } 
}