import java.util.Arrays;

public class Equals {
    public static void main(String[] args){

        int[] num1={0,1,2,3,4,5,6,7,8,9};
        int[] num2={0,1,2,3,4,5,6,7,8,9};
        int[] num3={9,8,7,6,5,4,3,2,1,0};
        int[] num4={10,4,7,23,4,10,8,0,4,9};
        int[] num5=new int[10];

        System.out.printf("num1 igual num2: %s%n",Arrays.equals(num1, num2)?"igual":"diferente");
        System.out.printf("num1 igual num3: %s%n",Arrays.equals(num1, num3)?"igual":"diferente");
        System.out.printf("num1 igual num4: %s%n",Arrays.equals(num1, num4)?"igual":"diferente");


    }
}
