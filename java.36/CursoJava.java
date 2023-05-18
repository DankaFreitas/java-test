import java.lang.reflect.Array;
import java.util.ArrayList;

public class CursoJava{

    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>();

        numeros.add(11);
        numeros.add(22);
        numeros.add(33);

        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");

        for(int e:numeros){
            System.out.println(e);
        }

        for(String e:carros){
            System.out.println(e);
        }


    }
}