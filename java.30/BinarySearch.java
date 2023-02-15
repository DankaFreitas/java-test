import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args){

        int[] num1={0,1,2,3,4,5,6,7,8,9};
        int[] num2={0,1,2,3,4,5,6,7,8,9};
        int[] num3={9,8,7,6,5,4,3,2,1,0};
        int[] num4={10,4,7,23,4,10,8,0,4,9};
        int[] num5=new int[10];

        int valor=9;
        int pos=Arrays.binarySearch(num1, valor);
        System.out.printf("%d estao no arrays? %s - posicao:%d%n",valor, pos>-1?"Sim":"Não",pos);


    }
}
