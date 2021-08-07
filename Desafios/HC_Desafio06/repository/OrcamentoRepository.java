package HC_Desafio06.repository;

public class OrcamentoRepository implements Buscavel{
    @Override
    public void findById() {
        System.out.println("Buscando Orcamento por ID!");
    }

    @Override
    public void findAll() {
        System.out.println("Buscando em Orcamento!");
    }
}
