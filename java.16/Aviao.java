import veiculos.Veiculo;

public class Aviao extends Veiculo {

    private int categorias;

    public Aviao(String nome, int categorias){
        super(nome, 10);
        this.categorias=categorias;

    }

    public void info(){
        super.info();
        System.out.printf("Categoria:%s%n",this.categorias);
    }


}