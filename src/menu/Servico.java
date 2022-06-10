
package menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



//
public class Servico {

    //A lista que armazena pacientes
    public ArrayList<Paciente> listaDePacientes = new ArrayList<>();

    //metodo para já existir pacientes no array cadastrados
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
        //variavel encontado para informar se foi encontrado ou não, quando o codigo encontra algum paciente vira true
        boolean encontrado = false;

        System.out.println("****ESCOLHA UMA OPCAO****\n");
        System.out.println("1 - Listagem normal");
        System.out.println("2 - Listagem em ordem alfabeitca\n");
        System.out.print("Digite a opcao: ");
        opc = scan.nextInt();
        //opc é igual a 1 ele lista os pacientes sem ordemn
        if (opc == 1) {
            for (int i = 0; i < listaDePacientes.size(); i++) {

                System.out.println("====================");
                listaDePacientes.get(i).imprimirPacientes();
                System.out.println("====================\n");
                encontrado = true;

            }
            //se opc igual a 2 implementamos o metodo de ordenar sor para ordenar em ordem alfabetica
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
//metodo de buscar quando atribuido algum valor a "identificador" pecorre o arraylist e comparando com equals pra saber se é igual
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
        //se não encontrar ele continua encontrado continua false entrando no if
        if (!encontrado) {
            System.out.println("Nao encontrado!");
        }
    }
//apresenta o mesmo metodo de busca com interfação textual de edicao
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

                    switch (opc) {
                        case 1:
                        //puxa o nome do paciente no arraylist e seta um novo
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
                        case 2:
                        //puxa o cpf do paciente no arraylist e seta um novo
                            System.out.println("Digite o novo Cpf: ");
                            String novoCpf = scan.next();
                            listaDePacientes.get(i).setCpf(novoCpf);
                            System.out.println("**** Cpf alterado com sucesso! ****");
                            System.out.println("=============================");
                            listaDePacientes.get(i).imprimirPacientes();
                            System.out.println("=============================\n");
                            break;
                        case 3:
                        //puxa a data de nascimento do paciente no arraylist e seta uma nova
                            System.out.println("Digite a nova Data de Nascimento: ");
                            int novaDataDeNascimento = scan.nextInt();
                            listaDePacientes.get(i).setDataNascimento(novaDataDeNascimento);
                            System.out.println("**** Data de nascimento alterada com sucesso! ****");
                            System.out.println("=============================");
                            listaDePacientes.get(i).imprimirPacientes();
                            System.out.println("=============================\n");
                            break;
                        case 4:
                        //puxa o sexo de paciente e seta um novo
                            System.out.println("Digite o novo sexo: ");
                            char novoSexo = scan.next().charAt(0);
                            listaDePacientes.get(i).setSexo(novoSexo);
                            System.out.println("**** Sexo alterado com sucesso! ****");
                            System.out.println("=============================");
                            listaDePacientes.get(i).imprimirPacientes();
                            System.out.println("=============================");
                            break;
                        case 5:
                        //Pergunta se quer excluir o paciente se "sim", exclui e retorna, se "não" volta pro metodo editar
                            System.out.println("Quer realmente excluir o paciente?");
                            String decisao = scan.next();
                            if (decisao.equals("sim")) {
                                listaDePacientes.remove(listaDePacientes.get(i));
                                
                                return;
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
