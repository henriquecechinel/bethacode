package HC_Desafio04;

public class Funcionario extends PessoaFisica{
    private Double salarioBruto;
    private Double salarioLiquido;

    public Funcionario(Integer id, String nome, String endereco, String telefone, String cpf, String rg, String sexo, Double salarioBruto, Double salarioLiquido) {
        super(id, nome, endereco, telefone, cpf, rg, sexo);
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public void aplicarDissidio(Double reajustePercentual){
        System.out.println("\nAplicando dissidio de " + reajustePercentual + "%");
        System.out.println("Salario Bruto/Liquido antigo: R$" + salarioBruto + "/R$" + salarioLiquido);
        salarioBruto = (salarioBruto * (1 + (reajustePercentual/100)));
        salarioLiquido = (salarioLiquido * (1 + (reajustePercentual/100)));
        System.out.println("Salario Bruto/Liquido novo: R$" + salarioBruto + "/R$" + salarioLiquido);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salarioBruto=" + salarioBruto +
                ", salarioLiquido=" + salarioLiquido +
                "} " + super.toString();
    }
}
