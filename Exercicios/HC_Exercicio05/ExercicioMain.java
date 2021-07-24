package HC_Exercicio05;

public class ExercicioMain {
    public static void main(String[] args) {
        Animal animal1 = AnimalBuilder.criaAnimal("GATO","Xarles","Jaguara","Miau",4);
        System.out.println(animal1.getSom());

        Animal animal2 = AnimalBuilder.criaAnimal("CACHORRO","Plancton","Husky","AuAu",4);
        System.out.println(animal2.getSom());

        Animal animal3 = AnimalBuilder.criaAnimal("JACARE","Jonas","Astrolomeus","Argh",4);
        System.out.println(animal3.getSom());
    }
}
