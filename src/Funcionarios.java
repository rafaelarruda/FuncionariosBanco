// public abstract class Funcionarios = usar o abstract, não permitirá a criação de contas
public class Funcionarios {

    private String nome;
    private String cpf;
    protected double salario;   // protected publico para os filhos, para o gerente usar em um método


    // Bonificação de 10% em cima do salário
    public double getBonificacao() {
        return this.salario * 0.1;
    }


    // Getters and Setters
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
