package HC_Desafio06.repository;

public class ProdutoRepository implements Buscavel{
    @Override
    public void findById() {
        System.out.println("Buscando Produto por ID!");
    }

    @Override
    public void findAll() {
        System.out.println("Buscando em Produto!");
    }
}
