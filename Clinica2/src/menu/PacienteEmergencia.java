package menu;

public final class PacienteEmergencia extends Paciente {
    private static String prioridade;
    private String ocorrencia;

    public PacienteEmergencia(String idPaciente, String nome, String cpf, int dataNascimento, char sexo, String prioridade, String ocorrencia) {
        super(idPaciente, nome, cpf, dataNascimento, sexo);
        this.prioridade = prioridade;
        this.ocorrencia = ocorrencia;
    }
    // Métodos GET
    public static String getPrioridade(int valor) {
        switch (valor) {
            case 1:
                prioridade = "Emenrgencia";
                break;
            case 2:
                prioridade = "Muito Urgente";
                break;
            case 3:
                prioridade = "Urgente";
                break;
            case 4:
                prioridade = "Pouco Urgente";
                break;
            case 5:
                prioridade = "Nao Urgente";
                break;
        }
        return prioridade;
    }


    public void imprimirPacientes() {
        System.out.println("Identificacao = " + idPaciente);
        System.out.println("Nome = " + nome);
        System.out.println("Cpf = " + cpf);
        //System.out.println("Data de nascimento = " + dataNascimento);
        //System.out.println("Sexo = " + sexo);
        System.out.println("Prioridade: " + prioridade);
        //System.out.println("Ocorrencia: " + ocorrencia);
    }

}
