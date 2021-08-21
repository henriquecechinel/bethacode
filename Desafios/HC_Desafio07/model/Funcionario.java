package HC_Desafio07.model;

public class Funcionario extends AbstractPessoa{
    public Funcionario(Integer id, String nome, String cpf, Double salario) {
        super(id, nome, cpf, salario);
    }

    @Override
    public String toString() {
        return "Funcionario{} " + super.toString();
    }
}
