import java.util.ArrayList;

public class exem2 {
    public static void main(String[] args){

        ArrayList<String> carros = new ArrayList<>();

        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add(1,"Argo");
        carros.add(1,"Fusion");

        for(String e:carros){
            System.out.println(e);
        }


    }
}
