package HC_Desafio05;

public class FuncionarioBuilder {
    public static Funcionario criaFuncionario(String tipo, Integer id, String nome, String cpf, Double salarioBruto){
        switch (tipo){
            case "ESTAGIARIO":
                return new Estagiario(id, nome, cpf, salarioBruto);
            case "ANALISTA":
                return new Analista(id, nome, cpf, salarioBruto);
            case "ARQUITETO_SOFT":
                return new ArquitetoSoft(id, nome, cpf, salarioBruto);
            case "COORDENADOR":
                return new Coordenador(id, nome, cpf, salarioBruto);
            default:
                return new Funcionario(id, nome, cpf, salarioBruto);
        }
    }

    public static Funcionario criaFuncionario(String tipo, Integer id, String nome, String cpf) {
        return criaFuncionario(tipo, id, nome, cpf, null);
    }

    public static Funcionario criaFuncionario(String tipo, Integer id, String nome) {
        return criaFuncionario(tipo, id, nome, null);
    }
}
