package HC_Desafio06.service;

public class ServicoService implements Persistivel{
    @Override
    public void save() {
        System.out.println("Salvando Servico!");
    }

    @Override
    public void update() {
        System.out.println("Atualizando Servico!");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Servico!");
    }
}
