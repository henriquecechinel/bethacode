package HC_Desafio04;

public class Fornecedor extends PessoaJuridica{
    private String responsavel;
    private String observacao;

    public Fornecedor(Integer id, String nome, String endereco, String telefone, String cnpj, String inscricaoEstadual, String cnae, String responsavel, String observacao) {
        super(id, nome, endereco, telefone, cnpj, inscricaoEstadual, cnae);
        this.responsavel = responsavel;
        this.observacao = observacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "responsavel='" + responsavel + '\'' +
                ", observacao='" + observacao + '\'' +
                "} " + super.toString();
    }
}
