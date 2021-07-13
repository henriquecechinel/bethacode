package HC_Exercicio02;

public class Construcao {
    private Double metragemQuadrada;
    private Integer numeroQuartos;
    private Integer numeroBanheiros;

    public Construcao(Double metragemQuadrada, Integer numeroQuartos, Integer numeroBanheiros) {
        this.metragemQuadrada = metragemQuadrada;
        this.numeroQuartos = numeroQuartos;
        this.numeroBanheiros = numeroBanheiros;
    }

    public Double getMetragemQuadrada() {
        return metragemQuadrada;
    }

    public void setMetragemQuadrada(Double metragemQuadrada) {
        this.metragemQuadrada = metragemQuadrada;
    }

    public Integer getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(Integer numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public Integer getNumeroBanheiros() {
        return numeroBanheiros;
    }

    public void setNumeroBanheiros(Integer numeroBanheiros) {
        this.numeroBanheiros = numeroBanheiros;
    }
}
