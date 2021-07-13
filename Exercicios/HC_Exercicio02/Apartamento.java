package HC_Exercicio02;

public class Apartamento extends Construcao{
    private Integer andar;
    private Boolean vizinhoAmigavel;

    public Apartamento(Double metragemQuadrada, Integer numeroQuartos, Integer numeroBanheiros, Integer andar, Boolean vizinhoAmigavel) {
        super(metragemQuadrada, numeroQuartos, numeroBanheiros);
        this.andar = andar;
        this.vizinhoAmigavel = vizinhoAmigavel;
    }

    public Integer getAndar() {
        return andar;
    }

    public void setAndar(Integer andar) {
        this.andar = andar;
    }

    public Boolean getVizinhoAmigavel() {
        return vizinhoAmigavel;
    }

    public void setVizinhoAmigavel(Boolean vizinhoAmigavel) {
        this.vizinhoAmigavel = vizinhoAmigavel;
    }

    @Override
    public String toString() {
        return  "Metragem Quadrada: " + super.getMetragemQuadrada() + "m²" + "\n" +
                "Numero de Quartos: " + super.getNumeroQuartos() + "\n" +
                "Numero de Banheiros: " + super.getNumeroBanheiros() + "\n" +
                "Andar: " + andar + "º" + "\n" +
                "Vizinho: " + (vizinhoAmigavel ? "Amigável" : "Rude") + "\n";
    }
}
