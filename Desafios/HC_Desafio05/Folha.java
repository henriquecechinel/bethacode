package HC_Desafio05;

public class Folha {
    private Integer id;
    private Funcionario funcionario;
    private String dataPagamento;
    private Desconto[] desconto;
    private Double salarioLiquido;

    public Folha(Integer id, Funcionario funcionario, String dataPagamento, Desconto[] desconto) {
        this.id = id;
        this.funcionario = funcionario;
        this.dataPagamento = dataPagamento;
        this.desconto = desconto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Desconto[] getDescontos() {
        return desconto;
    }

    public void setDescontos(Desconto[] desconto) {
        this.desconto = desconto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    @Override
    public String toString() {
        return "Folha{" +
                "id=" + id +
                ", funcionario=" + funcionario +
                ", dataPagamento='" + dataPagamento + '\'' +
                ", desconto=" + desconto +
                ", salarioLiquido=" + salarioLiquido +
                '}';
    }

    public Double getDescontoINSS(Double salarioBruto) {
        Double desconto = 0.0;

        if(salarioBruto > 1100.0){
            desconto += (1100.0 * 0.075);
            salarioBruto -= 1100.0;

            if(salarioBruto > 2203.48){
                desconto += (2203.48 * 0.09);
                salarioBruto -= 2203.48;

                if(salarioBruto > 3305.22){
                    desconto += (3305.22 * 0.12);
                    salarioBruto -= 3305.22;

                    if(salarioBruto > 6433.57){
                        desconto += (6433.57 * 0.14);
                    } else {
                        desconto += (salarioBruto * 0.14);
                    }
                } else {
                    desconto += (salarioBruto * 0.12);
                }
            } else {
                desconto += (salarioBruto * 0.09);
            }
        } else {
            desconto += (salarioBruto * 0.075);
        }

        System.out.println("Desconto INSS: R$" + desconto);

        return desconto;
    }

    public Double getDescontoIRPF(Double salarioBruto){
        Double desconto = 0.0;
        Double descontoPercentual = 0.0;

        if(salarioBruto <= 1903.98){
            descontoPercentual = 0.0;
        } else if(salarioBruto <= 2826.65){
            descontoPercentual = 7.5;
        } else if(salarioBruto <= 3751.05){
            descontoPercentual = 15.0;
        } else if(salarioBruto <= 4664.68){
            descontoPercentual = 22.5;
        } else {
            descontoPercentual = 27.5;
        }

        desconto = (salarioBruto * (descontoPercentual/100));

        System.out.println("Desconto IRPF: R$" + desconto);

        return desconto;
    }

    public Double calcular(){
        Double salarioLiquido = calcular(null);

        return salarioLiquido;
    }

    public Double calcular(Desconto[] descontos){
        Double salarioLiquido = calcular(descontos, null);

        return salarioLiquido;
    }

    public Double calcular(Desconto[] descontos, Double bonus){
        Double salarioBruto = funcionario.getSalarioBruto();
        Double salarioLiquido = salarioBruto;

        if(salarioBruto == null){
            System.out.println("O Funcionário não possuí Salário Bruto!");
            return 0.0;
        }

        System.out.println("\nSalário Bruto + Bônus: R$" + salarioBruto);

        salarioLiquido -= getDescontoINSS(salarioBruto);
        salarioLiquido -= getDescontoIRPF(salarioBruto);

        if(descontos != null) {
            for (Desconto desconto : descontos) {
                salarioLiquido -= desconto.getValor();
                System.out.println("Desconto extra (" + desconto.getDescricao() + "): R$" + desconto.getValor());
            }
        }

        if(bonus != null) {
            salarioLiquido += bonus;
            System.out.println("Bônus extra: R$" + bonus);
        }

        System.out.println("Salário liquido: R$" + salarioLiquido);

        return salarioLiquido;
    }
}
