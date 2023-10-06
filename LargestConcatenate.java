import java.util.Scanner;
public class LargestConcatenate{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] array = new int[5];
        for(int i = 0; i<5 ; i++){
            array[i]=scn.nextInt();
        }
        largestConcatenate(array);
    }
    //GREEDY ALGORITHM
    public static void largestConcatenate(int[] numbersList){
    //sorting
        int buffer = 0;
        for(int i=0; i<numbersList.length-1; i++){
            if(numbersList[i] < numbersList[i+1]){
                buffer = numbersList[i];
                numbersList[i] = numbersList[i+1];
                numbersList[i+1] = buffer;
            }
        }
        String stringNumbers = numbersList.toString();
        System.out.println(stringNumbers);
    }
}