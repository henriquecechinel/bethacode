package HC_Exercicio03;

public class CalculadoraMain {
    public static void main(String[] args) {
        calcular(1,1);
        calcular(1.1,1.1);
        calcular("1","1");
    }

    public static void calcular(Integer a, Integer b){
        System.out.println("(" + a + " + " + b + ") = " + (a + b));
    }

    public static void calcular(Double a, Double b){
        System.out.println("(" + a + " + " + b + ") = " + (a + b));
    }

    public static void calcular(String a, String b){
        System.out.println("('" + a + "' + '" + b + "') = " + (a + b));
    }
}
