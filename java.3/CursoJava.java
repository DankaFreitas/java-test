public class CursoJava {
    public static void main(String [] args){

        int nota=85;
        int faltas=10;
        int maxFaltas=5;
        int media=60;
        
        int res;

        int pos=5;

        switch(pos){
            case 1:
                System.out.println("Primeiro Lugar");
                break;
            case 2:
                System.out.println("Segunda Lugar");
                break;
            case 3:
                System.out.println("terceiro Lugar");
                break;
            case 4: case 5: case 6:
                System.out.println("Primio de participação");
                break;
            default:
                System.out.println("Não ganhou premio");
                break;

        }
        
        
        //String res;
         // res=(nota >= media ? "Aprovado " : "Reprovado ");
        //System.out.println("Resultado" + res);
        
        
        //int res;
        //res=(nota >= media ? 1 : 0);
        //System.out.println("Resultado" + (res==1?"Aprovado":"Reprovado"));

        //Tabela verdade AND &&
        /*
            V V= V
            V F= F
            F V= F
            F F= F
        */ 

         //Tabela verdade OR ||
        /*
            V V= V
            V F= V
            F V= V
            F F= F
        */ 

        if((nota >= media) && (faltas <= maxFaltas)){
            System.out.println("aprovado");
        }else if(nota >= 40){
            System.out.println("recuperação");
        }else{
            System.out.println("Reprovado");
        }
        System.out.println("Fim do programa");

    }
}