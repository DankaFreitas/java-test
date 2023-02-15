import java.util.Arrays;

public class Fill2 {
    public static void main(String[] args){

        int[] num={9,5,0,7,4,2,6,3,1,8};
        int[] num2=new int[10];

        Arrays.fill(num2, 10);

        for(int n:num2){

            System.out.printf("%d - ",n);
        }

    }
}
