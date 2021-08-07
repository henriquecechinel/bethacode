package HC_Desafio06.service;

public class ProdutoService implements Persistivel{
    @Override
    public void save() {
        System.out.println("Salvando Produto!");
    }

    @Override
    public void update() {
        System.out.println("Atualizando Produto!");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Produto!");
    }
}
