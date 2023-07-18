import java.util.Scanner;

public class SingleNumber{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the Array !!! ");
        int size=scanner.nextInt();

        System.out.println("Enter the Array Elements !!! ");
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }

        int singleNumber=singleNumberMethod(array,size);
        System.out.println("Single Number is : "+singleNumber);
    }

    private static int singleNumberMethod(int[] array, int size) {
        int result=0;
        for(int i=0;i<size;i++){
            result=result^array[i];
        }
        return result;
    }
}