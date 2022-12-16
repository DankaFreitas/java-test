import java.util.Scanner;

public class CursoJava {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        
        /* FOR
        for(int cont=0 ; cont < 5 ; cont++){
            System.out.println("Java Curso");
        }
        */

        int max=scan.nextInt();
        /*while */
        int cont=0;
        while(cont < max){
            System.out.println(cont + " - JAVA Curso");
            cont++;

        }

        System.out.println("Fim de programa");

    }
}