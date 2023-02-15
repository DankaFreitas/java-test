
import java.util.Arrays;

public class sort{
    
    public static void main(String[] args){

        int[] num={9,5,0,7,4,2,6,3,1,8};

        Arrays.sort(num);
        
        for(int n:num){

            System.out.printf("%d - ",n);
        }

    }
}