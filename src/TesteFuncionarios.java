public class TesteFuncionarios {

    public static void main(String[] args) {
        // Dados dos Funcionarios
        Funcionarios nico = new Funcionarios();
        nico.setNome("NicoRobin");
        nico.setCpf("016.854.998-78");
        nico.setSalario(3250.00);

        // Visualizando os dados
        System.out.println("Nome: " + nico.getNome());
        System.out.println("Bonificação Funcionario: " + nico.getBonificacao());
    }
}
