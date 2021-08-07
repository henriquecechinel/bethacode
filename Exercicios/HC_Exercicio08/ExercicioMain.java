package HC_Exercicio08;

public class ExercicioMain {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10);
        System.out.println(quadrado.getNomeFigura());
        System.out.println(quadrado.getArea());
        System.out.println(quadrado.getPerimetro());

        System.out.println("------");

        Triangulo triangulo = new Triangulo(10, 15, 5, 4, 3);
        System.out.println(triangulo.getNomeFigura());
        System.out.println(triangulo.getArea());
        System.out.println(triangulo.getPerimetro());
    }
}
