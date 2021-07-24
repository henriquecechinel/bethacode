package HC_Exercicio05;

public class Cachorro extends Animal{
    public Cachorro(String nome, String raca, String som, Integer qtdPatas) {
        super(nome, raca, som, qtdPatas);
    }

    public Cachorro(String nome, String raca, String som) {
        super(nome, raca, som);
    }

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public String getSom() {
        return super.getSom(" Auuuuuuuuu");
    }
}
