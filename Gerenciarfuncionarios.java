import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
a
public class GerenciarFuncionarios {

    public static List<Funcionarios> listaFuncionarios = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GerenciarFuncionarios gf = new GerenciarFuncionarios();
        int opcao = 0;
        do {
            System.out.println("\_____________________________/");
            System.out.println("Gerenciador de Funcionarios..");
            System.out.println("\_____________________________/");
            System.out.println("1 - Cadastrar Funcionario");
            System.out.println("2 - Consultar Funcionario");
            System.out.println("3 - Bonificar Unico Funcionario");
            System.out.println("4 - Bonificar todos os funcionarios");
            System.out.println("9 - Sair");
            System.out.println("O que voce deseja: ");

            opcao = Integer.parseInt(gf.sc.nextLine());

            switch (opcao) {
                case 1:
                    gf.execCadastrar();
                    break;
                case 2:
                    gf.execConsultar();
                    break;
                case 3:
                    gf.execBonificarUnico();
                    break;
                case 4:
                    gf.execConsultarUnico();
                    break;
                default:
                    System.out.println("Opcao Invalida");
                    break;
            }

        } while (opcao!=9);
    }

    public void execCadastrar(){
        System.out.println("Salario: ");
        double salario = Double.parseDouble(sc.nextLine());
        System.out.println("Registro: ");
        long registro = Long.parseLong(sc.nextLine());
        System.out.println("Esta Ativo [SIM/NAO]: ");
        boolean estaAtivo = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Departamento: ");
        String departamento = sc.nextLine();
        System.out.println("RG: ");
        String rg = sc.nextLine();
        
        Funcionarios funcionarios = new Funcionario(salario, registro, estaAtivo, nome, departamento, rg);
        listaFuncionarios.add(funcionarios);
    }

    public void execConsultarUnico(){

    }

    public void execConsultar(){

    }

    public void execBonificarUnico(){

    }

    public void execBonificar(){

    }


}
