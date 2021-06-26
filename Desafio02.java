import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        // Exercicio 1
        System.out.println("Exercicio 1");
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um numero de 1 à 7: ");
        int numero = s.nextInt();

        switch (numero){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Numero inserido invalido!");
                break;
        }


        // Exercicio 2
        System.out.println("Exercicio 2");
        int x = 10;
        while(x < 30){
            System.out.println("x: " + x);
            x++;
        }


        // Exercicio 3
        System.out.println("Exercicio 3");
        int y = 10;
        do {
            System.out.println("y: " + y);
            y++;
        } while(y < 30);


        // Exercicio 4
        System.out.println("Exercicio 4");
        System.out.print("Insira um numero de no maximo 4 digitos: ");
        int valor = s.nextInt();
        if (valor > 9999){
            System.out.println("Valor inserido invalido!");
        } else {
            int resto = 0;
            while (valor > 0) {
                resto = resto * 10 + valor % 10;
                valor /= 10;
            }
            System.out.println("Numero invertido: " + resto);
        }


        // Exercicio 5
        System.out.println("Exercicio 5");
        System.out.println("Insira o valor 'h' (altura) do trapezio: ");
        double h = s.nextInt();
        System.out.println("Insira o valor 'b' (base menor) do trapezio: ");
        double b = s.nextInt();
        System.out.println("Insira o valor 'B' (base maior) do trapezio: ");
        double B = s.nextInt();
        double area = (h*(b+B))/2;
        System.out.println("Area do trapezio: " + area);

        // Exercicio 6
        for (int o = 15; o <= 35; o++){
            if (o % 2 != 0){
                int quadrado = o * o;
                System.out.println("Quadrado dos ímpares: " + quadrado);
            }
        }
    }
}
