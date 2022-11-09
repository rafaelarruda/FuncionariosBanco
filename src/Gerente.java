public class Gerente extends Funcionarios{

    private int senha;


    // Autenticar senha
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }


    // Bonificação de salário
    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }



    // Getters and Setters
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
