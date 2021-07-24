package HC_Exercicio05;

public class Jacare extends Animal{
    public Jacare(String nome, String raca, String som, Integer qtdPatas) {
        super(nome, raca, som, qtdPatas);
    }

    public Jacare(String nome, String raca, String som) {
        super(nome, raca, som);
    }

    public Jacare(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public String getSom() {
        return super.getSom(" Arrrrrrrrrggggggghhhhhhh");
    }
}
