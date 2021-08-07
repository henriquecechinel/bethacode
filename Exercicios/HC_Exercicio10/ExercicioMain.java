package HC_Exercicio10;

import java.util.Scanner;

public class ExercicioMain {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um valor: ");
        Integer valor = scanner.nextInt();

        try {
            if (valor > 10) {
                ValorMaiorQueOPermitidoException me = new ValorMaiorQueOPermitidoException("Valor maior que o permitido!");
                throw me;
            }

            if (valor < 3) {
                ValorMenorQueOPermitidoException me = new ValorMenorQueOPermitidoException("Valor menor que o permitido!");
                throw me;
            }
        } catch (Exception e){
            System.out.println("Regra: " + e.getMessage());
        }
    }
}
