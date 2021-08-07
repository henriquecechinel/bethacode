package HC_Exercicio09;

public class Carro implements Motor,Veiculo {
    private String motor;
    private int anoMotor;
    private String idMotor;
    private String modelo;
    private int ano;
    private String fabricante;
    private String pais;

    public Carro(String motor, int anoMotor, String idMotor, String modelo, int ano, String fabricante, String pais) {
        this.motor = motor;
        this.anoMotor = anoMotor;
        this.idMotor = idMotor;
        this.modelo = modelo;
        this.ano = ano;
        this.fabricante = fabricante;
        this.pais = pais;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getAnoMotor() {
        return anoMotor;
    }

    public void setAnoMotor(int anoMotor) {
        this.anoMotor = anoMotor;
    }

    public String getIdMotor() {
        return idMotor;
    }

    public void setIdMotor(String idMotor) {
        this.idMotor = idMotor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String getNome() {
        return (motor + " - " + anoMotor);
    }

    @Override
    public String getId() {
        return (idMotor + "-" + anoMotor);
    }

    @Override
    public String getModelo() {
        return (fabricante + " " + modelo + " (" + ano + ")");
    }

    @Override
    public String getFabricante() {
        return (fabricante + " (" + pais + ")");
    }
}
