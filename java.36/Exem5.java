import java.util.ArrayList;

public class Exem5 {
    public static void main(String[] args){

        ArrayList<String> carros = new ArrayList<>();

        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Fusion");

      System.out.println(carros.indexOf("Polo"));
      carros.clear();

    }
}
