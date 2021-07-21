package HC_Desafio05;

public class Analista extends Funcionario{
    public Analista(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public Analista(Integer id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public Analista(Integer id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto(){
        if(super.getSalarioBruto() != null) {
            return (super.getSalarioBruto()*1.10);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Analista{} " + super.toString();
    }
}
