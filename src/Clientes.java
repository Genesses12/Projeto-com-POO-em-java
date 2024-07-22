public class Funcionarios extends Pessoa {
    private String matricula;

    // Construtor
    public Funcionarios(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    // Método getter e setter
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}

public class Clientes extends Pessoa {
    private String codigoCliente;

    // Construtor
    public Clientes(String nome, String cpf, String codigoCliente) {
        super(nome, cpf);
        this.codigoCliente = codigoCliente;
    }

    // Método getter e setter
    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", codigoCliente='" + codigoCliente + '\'' +
                '}';
    }
}
