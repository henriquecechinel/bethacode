package HC_Desafio03;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class HC_Desafio03 {
    public static void main(String[] args) {
        Object[] exercicios = {"Todos", "1","2","3","4","5","6"};
        Object exercicioObject = JOptionPane.showInputDialog(null,
                "Selecione qual exercício você deseja executar", "Selecione o Exercício",
                JOptionPane.INFORMATION_MESSAGE, null, exercicios, exercicios[0]);
        String exercicioSelecionado = exercicioObject.toString();

        // Exercicio 01
        if (exercicioSelecionado.contains("Todos") || exercicioSelecionado.contains("1")){
            System.out.println("\n~ Exercicio 01 ~");
            int[] valores = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

            for (int it : valores) {
                System.out.println("Valor: " + it);
            }
        }



        // Exercicio 02
        if (exercicioSelecionado.contains("Todos") || exercicioSelecionado.contains("2")) {
            System.out.println("\n~ Exercicio 02 ~");
            int[] val = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

            double soma = 0.0;
            double media = 0.0;

            for (int it : val) {
                soma = soma + it;
            }

            media = soma / val.length;
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Quantidade de valores: " + val.length);
            System.out.println("Média dos valores: " + media);
        }



        // Exercicio 03
        if (exercicioSelecionado.contains("Todos") || exercicioSelecionado.contains("3")) {
            System.out.println("\n~ Exercicio 03 ~");
            int[] lista = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            List listaInvertida = new ArrayList();

            for (int i = (lista.length - 1); i >= 0; i--) {
                listaInvertida.add(lista[i]);
            }

            System.out.print("Lista original: ");
            for (int it : lista) {
                System.out.print(it + ", ");
            }

            System.out.print("\nLista invertida: ");
            for (Object it : listaInvertida) {
                System.out.print(it + ", ");
            }
        }



        // Exercicio 04
        if (exercicioSelecionado.contains("Todos") || exercicioSelecionado.contains("4")) {
            System.out.println("\n\n~ Exercicio 04 ~");
            String nome = JOptionPane.showInputDialog(null, "Digite o seu nome");

            String msg = "Nome informado: " + nome;
            JOptionPane.showMessageDialog(null, msg);
        }



        // Exercicio 05
        if (exercicioSelecionado.contains("Todos") || exercicioSelecionado.contains("5")) {
            System.out.println("\n~ Exercicio 05 ~");
            String parametros = JOptionPane.showInputDialog(null, "Insira 10 parâmetros separados por ',' (Ex: 1,99,5,6, ...)");

            parametros.trim();
            String[] parametrosArray = parametros.split(",");
            List parametrosArrayInvertido = new ArrayList();

            if (parametrosArray.length != 10) {
                JOptionPane.showMessageDialog(null, "Você informou uma quantidade de parâmetros inválida!", "Erro!", JOptionPane.ERROR_MESSAGE);
            } else {
                for (int i = (parametrosArray.length - 1); i >= 0; i--) {
                    parametrosArrayInvertido.add(parametrosArray[i]);
                }

                String mensagem = "Você informou os seguintes parâmetros: [" + parametros + "].\n" +
                        "Invertendo a ordem de entrada, temos: " + parametrosArrayInvertido;
                JOptionPane.showMessageDialog(null, mensagem);
            }
        }



        // Exercicio 06
        if (exercicioSelecionado.contains("Todos") || exercicioSelecionado.contains("6")) {
            System.out.println("\n~ Exercicio 06 ~");
            String altura = JOptionPane.showInputDialog(null, "Informe a sua Altura:");
            String peso = JOptionPane.showInputDialog(null, "Informe o seu Peso:");

            Double alturaDouble = Double.parseDouble(altura);
            Double pesoDouble = Double.parseDouble(peso);

            Double imc = (pesoDouble / (alturaDouble * alturaDouble));

            JOptionPane.showMessageDialog(null, "O seu IMC é: " + imc);
        }
    }
}
