package HC_Exercicio07;

public class ExercicioMain {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Postulos", 1000.0);
        System.out.println("Gerente: " + gerente.getBonificacao());

        Diretor diretor = new Diretor("Orlei",1000.0);
        System.out.println("Diretor: " + diretor.getBonificacao());

        Presidente presidente = new Presidente("Julio", 1000.0);
        System.out.println("Presidente: " + presidente.getBonificacao());

        Secretaria secretariaAgencia = new SecretariaAgencia("Uelington", 1000.0);
        System.out.println("Secretaria Agencia: " + secretariaAgencia.getBonificacao());

        Secretaria secretariaAdministrativa = new SecretariaAdministrativa("Priscila", 1000.0);
        System.out.println("Secretaria Administrativa: " + secretariaAdministrativa.getBonificacao());
    }
}
