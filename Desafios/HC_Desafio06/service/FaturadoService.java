package HC_Desafio06.service;

public class FaturadoService implements Persistivel{
    @Override
    public void save() {
        System.out.println("Salvando Faturado!");
    }

    @Override
    public void update() {
        System.out.println("Atualizando Faturado!");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Faturado!");
    }
}
