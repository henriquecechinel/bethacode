package HC_Desafio05;

import javax.swing.JOptionPane;

public class DesafioMain {
    public static void main(String[] args) {
        Desconto[] descontos = new Desconto[3];
        descontos[0] = new Desconto(1,"UNIMED", 100.50);
        descontos[1] = new Desconto(2, "GASOLINA", 375.19);
        descontos[2] = new Desconto(3, "CAFE", 25.73);

        Object[] tipos_funcionario = {"ESTAGIARIO","ANALISTA","ARQUITETO_SOFT","COORDENADOR"};
        String tipoFuncionario = (JOptionPane.showInputDialog(null, "Selecione qual tipo de Funcionario você deseja criar", "Selecione o Tipo de Funcionario", JOptionPane.INFORMATION_MESSAGE, null, tipos_funcionario, tipos_funcionario[0])).toString();
        Double salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Insira o Salario Bruto do " + tipoFuncionario));

        Funcionario funcionario = FuncionarioBuilder.criaFuncionario(tipoFuncionario, 1, "Adão", "08057067047", salarioBruto);

        Folha folha = new Folha(1,funcionario,"2021-07-21", descontos);

        folha.calcular();
        folha.calcular(descontos);
        folha.calcular(descontos, 1000.0);
    }
}
