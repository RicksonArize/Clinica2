
package menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//
public class Servico {
    public ArrayList<Paciente> listaDePacientes = new ArrayList<>();


    public void pacientesJaCadastrados() {
        Paciente paciente1 = new Paciente("1", "Jamaica", "02102102136", 01042000, 'M');
        listaDePacientes.add(paciente1);
        Paciente paciente2 = new Paciente("2", "Alice", "12312312332", 12032000, 'F');
        listaDePacientes.add(paciente2);
        Paciente paciente3 = new Paciente("3", "Eva", "00011122233", 14062022, 'F');
        listaDePacientes.add(paciente3);
        Paciente paciente4 = new Paciente("4", "Adao", "01010101010", 13062022, 'M');
        listaDePacientes.add(paciente4);
        Paciente paciente5 = new Paciente("5", "Leticia", "20230340455", 11122000, 'F');
        listaDePacientes.add(paciente5);
        Paciente paciente6 = new Paciente("6", "Monica", "33311188899", 16101960, 'F');
        listaDePacientes.add(paciente6);
        Paciente paciente7 = new Paciente("7", "Cebolinha", "77777777708", 01052010, 'M');
        listaDePacientes.add(paciente7);

    }

    int opc = 0;
    Scanner scan = new Scanner(System.in);


    //metodo cadastro paciente na lista
    public void cadrastarPaciente(Paciente paciente) {
        listaDePacientes.add(paciente);
    }

    //metodo que lista os pacientes
    public void listarPacientes() {
        boolean encontrado = false;

        System.out.println("****ESCOLHA UMA OPCAO****\n");
        System.out.println("1 - Listagem normal");
        System.out.println("2 - Listagem em ordem alfabeitca\n");
        System.out.print("Digite a opcao: ");
        opc = scan.nextInt();

        if (opc == 1) {
            for (int i = 0; i < listaDePacientes.size(); i++) {

                System.out.println("====================");
                listaDePacientes.get(i).imprimirPacientes();
                System.out.println("====================\n");
                encontrado = true;

            }
        } else if (opc == 2) {
            Collections.sort(listaDePacientes);

            for (int i = 0; i < listaDePacientes.size(); i++) {

                System.out.println("====================");
                listaDePacientes.get(i).imprimirPacientes();
                System.out.println("====================\n");
                encontrado = true;

            }
        } else {
            System.out.println("Digite uma opcao valida!");
        }
        if (!encontrado) {
            System.out.println("********************************");
            System.out.println("********** Lista vazia *********");
            System.out.println("********************************\n");
        }
    }
         //metodo para buscar pacientes
    public void buscarPacientes(String identificador) {
        boolean encontrado = false;
        for (int i = 0; i < listaDePacientes.size(); i++) {
            if (listaDePacientes.get(i).getIdPaciente().equals(identificador)) {
                System.out.println("====================");
                listaDePacientes.get(i).imprimirPacientes();
                System.out.println("====================\n");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nao encontrado!");
        }
    }
               //metodo para editar pacientes
    public void editarPacientes(String idenficador) {
        boolean encontrado = false;
        for (int i = 0; i < listaDePacientes.size(); i++) {
            if (listaDePacientes.get(i).getIdPaciente().equals(idenficador)) {
                System.out.println("**** Paciente encontrado ****");
                System.out.println("=============================");
                listaDePacientes.get(i).imprimirPacientes();
                System.out.println("=============================\n");
                encontrado = true;
                do {
                    System.out.println("****ESCOLHA UMA OPCAO****\n");
                    System.out.println("1 - Alterar Nome");
                    System.out.println("2 - Alterar Cpf");
                    System.out.println("3 - Alterar Data de Nascismento");
                    System.out.println("4 - Alterar Sexo");
                    System.out.println("5 - Excluir Paciente");
                    System.out.println("6 - Sair \n");
                    System.out.print("Digite uma opcao: \n");
                    opc = scan.nextInt();
                    //switch case com as opções do menu
                    switch (opc) {
                        //mudança de nome
                        case 1:
                            System.out.println("Nome atual = " + listaDePacientes.get(i).getNome());
                            System.out.println("Digite o novo Nome: ");
                            String novoNome = scan.next();
                            System.out.println("Nome = " + listaDePacientes.get(i).getNome());
                            listaDePacientes.get(i).setNome(novoNome);
                            System.out.println("**** Nome alterado com sucesso! ****");
                            System.out.println("=============================");
                            listaDePacientes.get(i).imprimirPacientes();
                            System.out.println("=============================\n");
                            break;
                            //mudança de cpf
                        case 2:
                            System.out.println("Digite o novo Cpf: ");
                            String novoCpf = scan.next();
                            listaDePacientes.get(i).setCpf(novoCpf);
                            System.out.println("**** Cpf alterado com sucesso! ****");
                            System.out.println("=============================");
                            listaDePacientes.get(i).imprimirPacientes();
                            System.out.println("=============================\n");
                            break;
                            //mudança da data de nascimento
                        case 3:
                            System.out.println("Digite a nova Data de Nascimento: ");
                            int novaDataDeNascimento = scan.nextInt();
                            listaDePacientes.get(i).setDataNascimento(novaDataDeNascimento);
                            System.out.println("**** Data de nascimento alterada com sucesso! ****");
                            System.out.println("=============================");
                            listaDePacientes.get(i).imprimirPacientes();
                            System.out.println("=============================\n");
                            break;
                            //mudança de sexo
                        case 4:
                            System.out.println("Digite o novo sexo: ");
                            char novoSexo = scan.next().charAt(0);
                            listaDePacientes.get(i).setSexo(novoSexo);
                            System.out.println("**** Sexo alterado com sucesso! ****");
                            System.out.println("=============================");
                            listaDePacientes.get(i).imprimirPacientes();
                            System.out.println("=============================");
                            break;
                            //momento de decisão para excluir paciente
                        case 5:
                            System.out.println("Quer realmente excluir o paciente?");
                            String decisao = scan.next();
                            //se "sim" retornara para o menu principal
                            if (decisao.equals("sim")) {
                                listaDePacientes.remove(listaDePacientes.get(i));
                                return;
                                //se "não" retornara para o menu de edição
                            } else if (decisao.equals("nao")) {
                                break;
                            }
                            break;
                        case 6:
                            break;
                    }
                } while (opc != 6);


            }

        }
        if (!encontrado) {
            System.out.println("Nao encontrado!");
        }

    }


}
