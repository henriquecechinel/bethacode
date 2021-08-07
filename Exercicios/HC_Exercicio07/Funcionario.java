package HC_Exercicio07;

public abstract class Funcionario {
    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract Double getBonificacao();

    public Double getSalario(){
        return this.salario;
    };

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
