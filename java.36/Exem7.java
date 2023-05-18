import java.util.ArrayList;

public class Exem7 {
    public static void main(String[] args){

        ArrayList<String> carros = new ArrayList<>();

        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Fusion");

        carros.remove(2);
      
      
      for(int i=0;i<carros.size();i++){
        System.out.println(carros.get(i));
      }

    }
}
