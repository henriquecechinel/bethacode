package HC_Desafio06.service;

public class OrcamentoService implements Persistivel{
    @Override
    public void save() {
        System.out.println("Salvando Orcamento!");
    }

    @Override
    public void update() {
        System.out.println("Atualizando Orcamento!");
    }

    @Override
    public void remove() {
        System.out.println("Removendo Orcamento!");
    }
}
