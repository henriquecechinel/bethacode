package HC_Exercicio04;

public class Funcionario extends Matricula{
    public Funcionario(Double salario) {
        super(salario);
    }

    @Override
    public Double getSalario(){
        return (super.getSalario()*1.2);
    }

    @Override
    public String toString() {
        return "Funcionario{} " + super.toString();
    }
}
