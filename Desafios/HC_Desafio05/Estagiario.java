package HC_Desafio05;

public class Estagiario extends Funcionario{
    public Estagiario(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public Estagiario(Integer id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public Estagiario(Integer id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto(){
        if(super.getSalarioBruto() != null) {
            return (super.getSalarioBruto() * 1.05);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Estagiario{} " + super.toString();
    }
}
