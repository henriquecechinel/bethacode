package ConhecimentoBase.EntradaDeDados;

import javax.swing.JOptionPane;

public class JOptionPaneMain {
    public static void main(String[] args) {
        texto();
        select();
        option();
        aviso();
    }

    public static void texto() {
        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
    }

    public static void select() {
        Object[] opcoes = {"Casa", "Apartamento","Mansão","Pensão"};
        Object opcaoSelecionada = JOptionPane.showInputDialog(null, "Mensagem", "Titulo",
                JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
    }

    public static void option() {
        Object[] opcoes = { "OK", "CANCELAR","VOLTAR" };
        Integer opcaoSelecionada = JOptionPane.showOptionDialog(null, "Mensagem", "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, opcoes, opcoes[0]);
    }

    public static void aviso() {
        JOptionPane.showMessageDialog(null, "Mensagem","Titulo", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensagem","Titulo", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensagem","Titulo", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensagem","Titulo", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Mensagem","Titulo", JOptionPane.PLAIN_MESSAGE);
    }
}
