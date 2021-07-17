package HC_Exercicio04;

public class ExercicioMain {
    public static void main(String[] args) {
        Matricula matricula1 = MatriculaBuilder.criaMatricula("ESTAGIARIO", 1000.0);
        Matricula matricula2 = MatriculaBuilder.criaMatricula("FUNCIONARIO", 1000.0);

        System.out.println("matricula1.getSalario(): " + matricula1.getSalario());
        System.out.println("matricula2.getSalario(): " + matricula2.getSalario());
    }
}
