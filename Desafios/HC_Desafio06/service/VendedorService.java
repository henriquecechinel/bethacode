package HC_Desafio06.service;

public class VendedorService implements Persistivel{
    @Override
    public void save() {
        System.out.println("Salvando Vendedor!");
    }

    @Override
    public void update() {
        System.out.println("Atualizando Vendedor!");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Vendedor!");
    }
}
