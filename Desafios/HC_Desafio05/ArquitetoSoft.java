package HC_Desafio05;

public class ArquitetoSoft extends Funcionario{
    public ArquitetoSoft(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public ArquitetoSoft(Integer id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    public ArquitetoSoft(Integer id, String nome) {
        super(id, nome);
    }

    @Override
    public Double getSalarioBruto(){
        if(super.getSalarioBruto() != null) {
            return (super.getSalarioBruto()*1.15);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return "ArquitetoSoft{} " + super.toString();
    }
}
