package HC_Exercicio05;

public class Gato extends Animal{
    public Gato(String nome, String raca, String som, Integer qtdPatas) {
        super(nome, raca, som, qtdPatas);
    }

    public Gato(String nome, String raca, String som) {
        super(nome, raca, som);
    }

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public String getSom() {
        return super.getSom(" Miiiiiii");
    }
}
