
package menu;

import java.util.Scanner;
//Classe principal de execução do Menu
public class Principal {

    public static void main(String[] args) {
        int opc = 0;
        Scanner scan = new Scanner(System.in);
        //instanciando a classe servico
        Servico servico = new Servico();
        //chamando metodo de adicionar cadastro de paciente
        servico.pacientesJaCadastrados();


        //inicio do laço com o menu da aplicação
        do {

            System.out.println("****ESCOLHA UMA OPCAO****\n");
            System.out.println("1 - Cadastrar Paciente");
            System.out.println("2 - Lista de Pacientes");
            System.out.println("3 - Buscar Paciente");
            System.out.println("4 - Editar Paciente");
            System.out.println("5 - Sair \n");
            System.out.print("Digite uma opcao: \n");
            opc = scan.nextInt();
            //switch case com as opções do menu
            switch (opc) {
                //primeiro caso onde são setados os valores da classe de pacientes
                case 1:

                    //Escrita textual do primeiro caso que pergunta se é paciente normal ou emergencial
                    System.out.println("Bem vindo ao sistema de cadastro de Paciente\n");
                    System.out.println("**** ESCOLHA O TIPO DE PACIENTE ****\n");
                    System.out.println("Tipo 1 - Paciente normal ");
                    System.out.println("Tipo 2 - Paciente Emergencial\n");
                    System.out.print("Digite o tipo de paciente:");
                    opc = scan.nextInt();

                    //switch que determina se é paciente normal no caso 1 ou paciente emergencial caso 2
                    switch (opc) {
                        case 1: {
                            //chama na tela perguntando as informações do paciente e atribui os valores ao novo paciente criado
                            System.out.println("Digite o identificador do paciente: ");
                            String id = scan.next();

                            System.out.println("Digite o nome do paciente: ");
                            String nome = scan.next();

                            System.out.println("Cpf: ");
                            String cpf = scan.next();

                            System.out.println("Data De Nascimento: ");
                            int dataDeNascimento = scan.nextInt();

                            System.out.println("Sexo ('F' para Feminino e 'M' para Masculino): ");
                            char sexo = scan.next().charAt(0);

                            Paciente paciente = new Paciente(id, nome, cpf, dataDeNascimento, sexo);


                            //chamada da classe que adiciona o paciente na lista de pacientes
                            servico.cadrastarPaciente(paciente);
                            break;
                        }
                        case 2:
                            System.out.println("Digite o identificador do paciente: ");
                            String id = scan.next();

                            System.out.println("Digite o nome do paciente: ");
                            String nome = scan.next();

                            System.out.println("Cpf: ");
                            String cpf = scan.next();

                            System.out.println("Data De Nascimento: ");
                            int dataDeNascimento = scan.nextInt();

                            System.out.println("Sexo ('F' para Feminino e 'M' para Masculino): ");
                            char sexo = scan.next().charAt(0);
                            //Interface textual que pergunta qual a prioridade
                            System.out.println("Prioridadades Emergenciais: ");
                            System.out.println("Tipo 1 - Prioridade Emergencia");
                            System.out.println("Tipo 2 - Prioridade Muito Urgente");
                            System.out.println("Tipo 3 - Prioridade Urgente");
                            System.out.println("Tipo 4 - Prioridade Pouco Urgente");
                            System.out.println("Tipo 5 - Prioridade Nao Urgente");
                            System.out.print("Digite o tipo de Emergencia: ");
                            int priori = scan.nextInt();

                            //Digita a causa ou acidente
                            System.out.println("Digite a ocorrencia: ");
                            String ocorrencia = scan.next();

                            PacienteEmergencia pacienteEmergencia = new PacienteEmergencia(id, nome, cpf, dataDeNascimento,
                                    sexo, PacienteEmergencia.getPrioridade(priori), ocorrencia);

                            //chamada da classe que adiciona o paciente na lista de pacientes
                            servico.cadrastarPaciente(pacienteEmergencia);
                            break;
                    }
                    break;

                //segundo caso onde é chamada a lista de pacientes
                case 2:
                //chama o metodo de listar
                    System.out.println("**** Listagem de Pacientes ****\n");
                    servico.listarPacientes();
                    break;

                case 3:
                // chama o metodo de buscar
                    System.out.println("*** Busca de paciente ***");
                    System.out.print("Digite o identificador do paciente: ");
                    String identificador = scan.next();
                    servico.buscarPacientes(identificador);
                    break;

                case 4:
                // chama o metodo editar
                    System.out.println("*** Editar de paciente ***");
                    System.out.print("Digite o identificador do paciente:");
                    String editar = scan.next();
                    servico.editarPacientes(editar);
                    break;

                case 5:
                //encerra a secao
                    break;

                default:
                    System.out.println("Opcao invalida, tente novamente.");
            }
            //encerra o do while quando opc é diferente de 5
        } while (opc != 5);
    }
}