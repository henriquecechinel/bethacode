package HC_Desafio05;

public class Coordenador extends Funcionario{
    public Coordenador(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public Coordenador(Integer id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public Coordenador(Integer id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto(){
        if(super.getSalarioBruto() != null) {
            return (super.getSalarioBruto()*1.20);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Coordenador{} " + super.toString();
    }
}
