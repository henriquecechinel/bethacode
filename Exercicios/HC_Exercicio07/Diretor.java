package HC_Exercicio07;

public class Diretor extends Gerente{
    public Diretor(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonificacao() {
        return getSalario()*1.2;
    }
}
