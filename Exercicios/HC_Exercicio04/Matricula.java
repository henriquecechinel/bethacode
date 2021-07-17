package HC_Exercicio04;

public class Matricula {
    private Double salario;

    public Matricula(Double salario) {
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "salario=" + salario +
                '}';
    }
}
