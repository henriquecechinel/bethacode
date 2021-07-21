package HC_Desafio05;

public class Funcionario {
    private Integer id;
    private String nome;
    private String cpf;
    private Double salarioBruto;

    public Funcionario(Integer id, String nome, String cpf, Double salarioBruto) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBruto = salarioBruto;
    }

    public Funcionario(Integer id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Funcionario(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", salarioBruto=" + salarioBruto +
                '}';
    }
}
