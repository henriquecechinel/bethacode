package ConhecimentoBase.EntradaDeDados;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        inputString(scanner);
        inputInt(scanner);
        inputDouble(scanner);
    }

    public static void inputString(Scanner scanner) {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Nome: " + nome);
    }

    public static void inputInt(Scanner scanner) {
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.println("Idade: " + idade);
    }

    public static void inputDouble(Scanner scanner) {
        System.out.print("Digite o peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Peso: " + peso);
    }
}
