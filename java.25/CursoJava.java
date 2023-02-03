public class CursoJava {
    public static void main(String[] args) {
    
        final int numCarros=5;
        //int[] num=new int[tamanho];
        Carro[] carros=new Carro[numCarros];
        String[] nomesCarros = {"HRV", "Golf", "Camaro","Mustang","toro"};

        for(int i=0;i<numCarros;i++){
            carros[i]=new Carro(nomesCarros[i]);
        }

        for(Carro c:carros){
            c.info();
        }
    }
 }