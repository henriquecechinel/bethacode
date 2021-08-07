package HC_Exercicio07;

public class SecretariaAgencia extends Secretaria{
    public SecretariaAgencia(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    @Override
    public Double getBonificacao() {
        return getSalario()*1.4;
    }
}
