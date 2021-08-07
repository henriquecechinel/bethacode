package HC_Desafio06.service;

public class PedidoService implements Persistivel{
    @Override
    public void save() {
        System.out.println("Salvando Pedido!");
    }

    @Override
    public void update() {
        System.out.println("Atualizando Pedido!");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Pedido!");
    }
}
