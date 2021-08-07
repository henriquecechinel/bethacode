package HC_Desafio06.repository;

public class VendaBalcaoRepository implements Buscavel{
    @Override
    public void findById() {
        System.out.println("Buscando Venda Balcao por ID!");
    }

    @Override
    public void findAll() {
        System.out.println("Buscando em Venda Balcao!");
    }
}
