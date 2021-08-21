package HC_Desafio07.model;

public class Diretor extends AbstractPessoa{
    private Double bonus;


    public Diretor(Integer id, String nome, String cpf, Double salario, Double bonus) {
        super(id, nome, cpf, salario);
        this.bonus = bonus;
    }

    public Diretor(){};

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "bonus=" + bonus +
                "} " + super.toString();
    }
}
