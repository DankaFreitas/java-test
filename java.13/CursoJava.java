public class CursoJava{
    public static void main(String[] args){

            int num=0;

            Jogador.pontos();
            Jogador.pontos();
            Jogador.pontos();
        
            
            Jogador j1 = new Jogador(++num);
            Jogador j2 = new Jogador(++num);
            Jogador j3 = new Jogador(++num);
            
            Jogador.alerta=true;


            j1.info();
            j2.info();
            j3.info();
            //jSystem.out.printf("%nVidas do jogador 1:%d", j1.getVidas());
            
    
    }
}