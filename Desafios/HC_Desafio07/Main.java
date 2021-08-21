package HC_Desafio07;

import HC_Desafio07.model.Diretor;
import HC_Desafio07.model.Funcionario;
import HC_Desafio07.repository.DiretorRepository;
import HC_Desafio07.repository.FuncionarioRepository;
import HC_Desafio07.service.DiretorService;
import HC_Desafio07.service.FuncionarioService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Funcionario funcionario1 = new Funcionario(1,"Henrique","99999999",1000.00);
        Funcionario funcionario2 = new Funcionario(2,"Cechinel","88888888",2000.00);

        FuncionarioService funcionarioService = new FuncionarioService();


        Diretor diretor1 = new Diretor(1,"Alisson","77777777",5000.00,1000.0);
        Diretor diretor2 = new Diretor(2,"Silva","666666666",8000.00,3000.0);

        DiretorService diretorService = new DiretorService();


        System.out.println(funcionarioService.save(funcionario1));
        System.out.println(funcionarioService.save(funcionario2));

        System.out.println(diretorService.save(diretor1));
        System.out.println(diretorService.save(diretor2));


        funcionario1.setNome("Carlos Roberto");
        System.out.println(funcionarioService.update(funcionario1));

        System.out.println(funcionarioService.delete(funcionario2));


        diretor1.setBonus(5000.00);
        System.out.println(diretorService.update(diretor1));

        System.out.println(diretorService.delete(diretor2));

        FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
        DiretorRepository diretorRepository = new DiretorRepository();

        System.out.println(funcionarioRepository.findAll());
        System.out.println(funcionarioRepository.findById(1));

        System.out.println(diretorRepository.findAll());
        System.out.println(diretorRepository.findById(1));
    }
}
