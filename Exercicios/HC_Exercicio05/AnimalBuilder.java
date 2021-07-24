package HC_Exercicio05;

public class AnimalBuilder {
    public static Animal criaAnimal(String tipo, String nome, String raca, String som, Integer qtdPatas){
        switch (tipo){
            case "GATO":
                return new Gato(nome,raca,som,qtdPatas);
            case "CACHORRO":
                return new Cachorro(nome,raca,som,qtdPatas);
            case "JACARE":
                return new Jacare(nome,raca,som,qtdPatas);
            default:
                return new Animal(nome,raca,som,qtdPatas);
        }
    }
}
