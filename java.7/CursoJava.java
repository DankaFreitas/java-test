import java.util.Arrays;

public class CursoJava{
    public static void main(String[] args){

        final int tam=10;
        int[] num={9,2,7,1,8,5,3,4,0,6};
        int[] numeros=new int[tam];
        int p=5;
        int pos;

        //Arrays.sort(num);
        //Arrays.fill(numeros,10);
        //System.arraycopy(num, 0, numeros, 0, tam);
        //System.out.printf("Arrays são iguais:%s",Arrays.equals(num,numeros) ? "Sim" : "Não");

        Arrays.sort(num);
        pos=Arrays.binarySearch(num, p);
        System.out.printf("O elemento %d esta no array? %s na posicao %d",p,pos > 0 ? "Sim" : "Não",pos);

       //for(int n:numeros){
           // System.out.printf("%d  - ",n);
        //}
    
        //for(int i=0;i<num.length;i++){
        //    System.out.printf("%d - ",num[i]);
        //}
        //System.out.printf("%nNota do  aluno:%d",nota);
        
        
    }

}