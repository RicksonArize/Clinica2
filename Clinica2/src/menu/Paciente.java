
package menu;

public class Paciente implements Comparable {
    // Atributos de instância
    protected String idPaciente;
    protected String nome;
    protected String cpf;
    protected int dataNascimento;
    protected char sexo;
    // Construtor
    public Paciente(String idPaciente, String nome, String cpf, int dataNascimento, char sexo) {
        this.idPaciente = idPaciente;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }
    // Métodos GET e SET
    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public int getDataNascimento() {

        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {

        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {

        this.sexo = sexo;
    }

    public void imprimirPacientes() {
        System.out.println("Identificacao = " + idPaciente);
        System.out.println("Nome = " + nome);
        System.out.println("Cpf = " + cpf);
        //System.out.println("Data de nascimento = " + dataNascimento);
        //System.out.println("Sexo = " + sexo);
    }

    @Override
    public int compareTo(Object o) {
        Paciente a = (Paciente) o;
        return this.nome.compareTo(a.getNome());
    }

}