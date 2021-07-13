package HC_Exercicio01;

public class HC_Exercicio01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Henrique", "08054680525", "6037501", 1.81, 76.4, "1999-01-08", "Adilson", "Elisangela");

        System.out.println(pessoa);
        pessoa.getImc();
    }

    static class Pessoa{
        String nome;
        String cpf;
        String rg;
        Double altura;
        Double peso;
        String dataNascimento;
        String nomePai;
        String nomeMae;

        public Pessoa(String nome, String cpf, String rg, Double altura, Double peso, String dataNascimento, String nomePai, String nomeMae) {
            this.nome = nome;
            this.cpf = cpf;
            this.rg = rg;
            this.altura = altura;
            this.peso = peso;
            this.dataNascimento = dataNascimento;
            this.nomePai = nomePai;
            this.nomeMae = nomeMae;
        }

        public void getImc (){
            Double imc = (peso / (altura * altura));
            System.out.println("IMC: " + imc);
        }

        @Override
        public String toString() {
            return  "Nome: " + nome + "\n" +
                    "Cpf: " + cpf + "\n" +
                    "Rg: " + rg + "\n" +
                    "Altura: " + altura + "\n" +
                    "Peso: " + peso + "\n" +
                    "Data de Nascimento: " + dataNascimento + "\n" +
                    "Nome do Pai: " + nomePai + "\n" +
                    "Nome da Mãe: " + nomeMae;
        }
    }
}
