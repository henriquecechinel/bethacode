package HC_Desafio06.repository;

public class ServicoRepository implements Buscavel{
    @Override
    public void findById() {
        System.out.println("Buscando Servico por ID!");
    }

    @Override
    public void findAll() {
        System.out.println("Buscando em Servico!");
    }
}
