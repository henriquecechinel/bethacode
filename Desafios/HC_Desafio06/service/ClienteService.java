package HC_Desafio06.service;

public class ClienteService implements Persistivel{
    @Override
    public void save() {
        System.out.println("Salvando Cliente!");
    }

    @Override
    public void update() {
        System.out.println("Atualizando Cliente!");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Cliente!");
    }
}
