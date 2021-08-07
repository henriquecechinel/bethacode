package HC_Desafio06.repository;

public class FaturadoRepository implements Buscavel{
    @Override
    public void findById() {
        System.out.println("Buscando Faturado por ID!");
    }

    @Override
    public void findAll() {
        System.out.println("Buscando em Faturado!");
    }
}
