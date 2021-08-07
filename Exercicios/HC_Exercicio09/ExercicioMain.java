package HC_Exercicio09;

public class ExercicioMain {
    public static void main(String[] args) {
        Carro carro = new Carro("Hiuston", 2009, "147293CDE499G5","Virtus", 2014,"Toyota", "China");

        System.out.println(carro.getModelo());
        System.out.println(carro.getFabricante());
        System.out.println(carro.getNome());
        System.out.println(carro.getId());
    }
}
