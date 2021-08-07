package HC_Desafio06.repository;

public class VendedorRepository implements Buscavel{
    @Override
    public void findById() {
        System.out.println("Buscando Vendedor por ID!");
    }

    @Override
    public void findAll() {
        System.out.println("Buscando em Vendedor!");
    }
}
