package HC_Exercicio02;
import javax.swing.JOptionPane;

public class MoradiaMain {
    public static void main(String[] args) {

        Casa casa = new Casa(322.4, 4, 4, 112.7, "Cimento");
        Apartamento apartamento = new Apartamento(112.2, 2, 2, 7, true);

        Object[] itens = {"Casa", "Apartamento"};
        Object tipo_de_moradia = JOptionPane.showInputDialog(null,
                "Selecione o que você deseja visualizar", "Tipo de moradia",
                JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        switch (tipo_de_moradia.toString()){
            case "Casa":
                JOptionPane.showMessageDialog(null, casa);
                break;

            case "Apartamento":
                JOptionPane.showMessageDialog(null, apartamento);
                break;
        }
    }
}