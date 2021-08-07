package HC_Desafio06.repository;

public class PedidoRepository implements Buscavel{
    @Override
    public void findById() {
        System.out.println("Buscando Pedido por ID!");
    }

    @Override
    public void findAll() {
        System.out.println("Buscando em Pedido!");
    }
}
