package ConhecimentoBase.Array_List_Map;

public class ArraySimplesMain {
    public static void main(String[] args){
        definicaoIndireta();
        definicaoDireta();
    }

    public static void definicaoIndireta(){
        System.out.println("\ndefinicaoIndireta: ");

        int[] jogoSena = new int[6];

        jogoSena[0] = 23;
        jogoSena[1] = 12;
        jogoSena[2] = 55;
        jogoSena[3] = 02;
        jogoSena[4] = 07;
        jogoSena[5] = 19;

        for (int num : jogoSena) {
            System.out.print(num + ", ");
        }
    }

    public static void definicaoDireta(){
        System.out.println("\ndefinicaoDireta: ");

        int[] outroJogoSena = {23,12,55,02,07,19};

        for(int num : outroJogoSena){
            System.out.print(num + ", ");
        }
    }
}
