package HC_Desafio06.repository;

public class ClienteRepository implements Buscavel{
    @Override
    public void findById() {
        System.out.println("Buscando Cliente por ID!");
    }

    @Override
    public void findAll() {
        System.out.println("Buscando em Cliente!");
    }
}
