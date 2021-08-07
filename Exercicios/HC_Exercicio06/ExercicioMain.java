package HC_Exercicio06;

public class ExercicioMain {
    public static void main(String[] args) {
        Funcionario funcionario = new Diretor("Henrique",1000.0);

        System.out.println(funcionario.getBonificacao());
    }
}
