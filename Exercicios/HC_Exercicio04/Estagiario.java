package HC_Exercicio04;

public class Estagiario extends Matricula{
    public Estagiario(Double salario) {
        super(salario);
    }

    @Override
    public Double getSalario(){
        return (super.getSalario()*1.1);
    }

    @Override
    public String toString() {
        return "Estagiario{} " + super.toString();
    }
}
