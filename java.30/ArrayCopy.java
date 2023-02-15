public class ArrayCopy {
    public static void main(String[] args){

        int[] num={9,5,0,7,4,2,6,3,1,8};
        int[] num2=new int[10];

        System.arraycopy(num, 0, num2, 0, num.length);

        for(int n:num2){

            System.out.printf("%d - ",n);
        }

    }
}
