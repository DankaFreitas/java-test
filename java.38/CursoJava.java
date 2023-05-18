import java.util.ArrayList;

public class CursoJava {
    public static void main(String[] args){

        int nota1,nota2,res;

        nota1=50;
        nota2=70;

        if(nota1 > 50){
            throw new IllegalArgumentException("Valor de notas invalido");
        }
        if(nota2 > 50){
            throw new IllegalArgumentException("Valor de notas invalido");
        }

        res=nota1+nota2;
        System.out.println("Resultado: " + res);
        

    }
}