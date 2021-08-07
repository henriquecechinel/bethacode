package HC_Desafio06.service;

public class VendaBalcaoService implements Persistivel{
    @Override
    public void save() {
        System.out.println("Salvando Venda Balcao!");
    }

    @Override
    public void update() {
        System.out.println("Atualizando Venda Balcao!");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Venda Balcao!");
    }
}
