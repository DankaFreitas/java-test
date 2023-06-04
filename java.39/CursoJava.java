import java.util.ArrayList;
public class CursoJava{
    public static void  main(String[] args){
        
        char[] texto_c={'c','u','r','s','o',' ','d','e',' ','j','a','v','a'};
        char[] texto_c2=new char[10];
        String texto_s= new String("Meu curso");
        int tam;
        char c;

        String s1=new String();
        String s2=new String(texto_s);
        String s3=new String(texto_c);
        String s4=new String(texto_c,0,5);

       tam=texto_s.length();
       System.out.println("Tamanho do texto: " + tam);

       c=texto_s.charAt(2);
       System.out.println("charAt: " + c);

       texto_s.getChars(4, 9, texto_c2, 0);
       System.out.println(texto_c2);



    }
}