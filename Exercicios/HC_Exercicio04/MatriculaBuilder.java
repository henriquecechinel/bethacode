package HC_Exercicio04;

public class MatriculaBuilder{
    public static Matricula criaMatricula(String tipo, Double salario){
        switch (tipo){
            case "ESTAGIARIO":
                return new Estagiario(salario);
            case "FUNCIONARIO":
                return new Funcionario(salario);
            default:
                return new Matricula(salario);
        }
    }
}
