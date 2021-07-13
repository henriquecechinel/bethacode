package HC_Desafio04;

public class Cliente extends PessoaFisica{
    private Double limiteCrediario;
    private Double limiteUtilizado;

    public Cliente(Integer id, String nome, String endereco, String telefone, String cpf, String rg, String sexo, Double limiteCrediario, Double limiteUtilizado) {
        super(id, nome, endereco, telefone, cpf, rg, sexo);
        this.limiteCrediario = limiteCrediario;
        this.limiteUtilizado = limiteUtilizado;
    }

    public Double getLimiteCrediario() {
        return limiteCrediario;
    }

    public void setLimiteCrediario(Double limiteCrediario) {
        this.limiteCrediario = limiteCrediario;
    }

    public Double getLimiteUtilizado() {
        return limiteUtilizado;
    }

    public void setLimiteUtilizado(Double limiteUtilizado) {
        this.limiteUtilizado = limiteUtilizado;
    }

    public void aumentarLimite(Double valorAdicao){
        System.out.println("\nAumentando o limite de crediario em R$" + valorAdicao);
        if(valorAdicao > 0) {
            System.out.println("Limite de Crediario antigo: R$" + limiteCrediario);
            limiteCrediario += valorAdicao;
            System.out.println("Limite de Crediario novo: R$" + limiteCrediario);
        } else {
            System.out.println("São permitidos apenas valores positivos!");
        }
    }

    public void diminuirLimite(Double valorReducao){
        System.out.println("\nDiminuindo o Limite de Crediario em R$" + valorReducao);
        if(valorReducao > 0){
            System.out.println("Limite de Crediario antigo: R$" + limiteCrediario);
            limiteCrediario -= valorReducao;
            System.out.println("Limite de Crediario novo: R$" + limiteCrediario);
        } else {
            System.out.println("São permitidos apenas valores positivos!");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "limiteCrediario=" + limiteCrediario +
                ", limiteUtilizado=" + limiteUtilizado +
                "} " + super.toString();
    }
}
