package HC_Exercicio07;

public class Presidente extends Funcionario{
    public Presidente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonificacao() {
        return getSalario()*1.1;
    }
}
