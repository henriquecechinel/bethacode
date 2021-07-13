package HC_Exercicio02;

public class Casa extends Construcao{
    private Double metragemJardim;
    private String materialTelha;

    public Casa(Double metragemQuadrada, Integer numeroQuartos, Integer numeroBanheiros, Double metragemJardim, String materialTelha) {
        super(metragemQuadrada, numeroQuartos, numeroBanheiros);
        this.metragemJardim = metragemJardim;
        this.materialTelha = materialTelha;
    }

    public Double getMetragemJardim() {
        return metragemJardim;
    }

    public void setMetragemJardim(Double metragemJardim) {
        this.metragemJardim = metragemJardim;
    }

    public String getMaterialTelha() {
        return materialTelha;
    }

    public void setMaterialTelha(String materialTelha) {
        this.materialTelha = materialTelha;
    }

    @Override
    public String toString() {
        return  "Metragem Quadrada: " + super.getMetragemQuadrada() + "m²" + "\n" +
                "Numero de Quartos: " + super.getNumeroQuartos() + "\n" +
                "Numero de Banheiros: " + super.getNumeroBanheiros() + "\n" +
                "Metragem do Jardim: " + metragemJardim + "m²" + "\n" +
                "Material da Telha: " + materialTelha + "\n";
    }
}