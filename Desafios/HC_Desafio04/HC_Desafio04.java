package HC_Desafio04;

public class HC_Desafio04 {
    public static void main(String[] args) {
        //Pessoa pessoa = new Pessoa(1,"Messi", "Rua dos coqueiros, 898, Centro, Criciuma", "48996835147");
        //PessoaJuridica pessoaJuridica = new PessoaJuridica(1,"Bianquini","Rua das palmeiras, 555, Cocal do Sul", "48996625148", "96.105.523/0001-71", "550.809.563.803", "3313-9/01");
        //PessoaFisica pessoaFisica = new PessoaFisica(1,"Erickson", "Rua das angérlias, 1325, Urussanga", "48998525414", "08055492501", "6038582", "M");
        Cliente cliente = new Cliente(1,"Richardzom", "Avenida das flores, 998, Criciuma", "48998752645", "09985462588", "9847582", "M",5000.00, 2485.49);
        Funcionario funcionario = new Funcionario(1, "Paulina", "Estrada verão, 447, Urussanga", "48996644251", "08459685222", "6025205", "F", 17641.55,13585.66);
        Fornecedor fornecedor = new Fornecedor(1, "Floricultura Julia", "Rua rosada, 1141, Cocal do Sul", "48996465824", "79.455.938/0001-56", "261.858.994.313", "3654-1/01", "Julia da Rosa", "Floricultura com grande diversidade de rosas!");

        //System.out.println("\nPessoa: " + pessoa);
        //System.out.println("\nPessoa Juridica: " + pessoaJuridica);
        //System.out.println("\nPessoa Fisica: " + pessoaFisica);
        System.out.println("\nCliente: " + cliente);
        System.out.println("\nFuncionario: " + funcionario);
        System.out.println("\nFornecedor: " + fornecedor);

        cliente.aumentarLimite(5000.00);
        cliente.diminuirLimite(100.00);

        funcionario.aplicarDissidio(5.0);

        System.out.println("");
        cliente.getDocumentoPrincipal();
        funcionario.getDocumentoPrincipal();
        fornecedor.getDocumentoPrincipal();
    }
}
