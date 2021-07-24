package HC_Exercicio05;

public class Animal {
    private String nome;
    private String raca;
    private String som;
    private Integer qtdPatas;

    public Animal(String nome, String raca, String som, Integer qtdPatas) {
        this.nome = nome;
        this.raca = raca;
        this.som = som;
        this.qtdPatas = qtdPatas;
    }

    public Animal(String nome, String raca, String som){
        new Animal(nome,raca,som,null);
    }

    public Animal(String nome, String raca){
        new Animal(nome,raca,null);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSom() {
        return som;
    }

    public String getSom(String somAMais){
        return som + somAMais;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public Integer getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(Integer qtdPatas) {
        this.qtdPatas = qtdPatas;
    }
}
