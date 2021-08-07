package HC_Exercicio11;

import java.util.*;

public class ExercicioMain {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1,"Erick", "0809998383", "3737284");
        Cliente cliente2 = new Cliente(2,"Jonas", "3734827166", "1274755");
        Cliente cliente3 = new Cliente(3,"Puyol", "1122384859", "1993848");

        List<Cliente> clientesList = new ArrayList<Cliente>();
        Set<Cliente> clientesSet = new HashSet<Cliente>();
        Map<String, Cliente> clientesMap = new TreeMap<String, Cliente>();

        clientesList.add(cliente1);
        clientesList.add(cliente2);
        clientesList.add(cliente3);

        clientesSet.add(cliente1);
        clientesSet.add(cliente2);
        clientesSet.add(cliente3);

        clientesMap.put(cliente1.getNome(), cliente1);
        clientesMap.put(cliente2.getNome(), cliente2);
        clientesMap.put(cliente3.getNome(), cliente3);

        System.out.println("List: " + clientesList);
        System.out.println("Set: " + clientesSet);
        System.out.println("Map: " + clientesMap);
    }
}
