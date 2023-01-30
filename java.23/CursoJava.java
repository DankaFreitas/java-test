public class CursoJava {
    public static void main(String[] args) {
        
        /*int cont =100;
        for(int i=0;i<cont;i++){
            System.out.printf("%d - ",i);
            if(i >= 10){
                break;
            }
        }*/

        int cont =100;
        for(int i=0;i<cont;i++){
            if(i >= 10 && i<=60){
                continue;
            }
            System.out.printf("%d - ",i);
        }
    }
}