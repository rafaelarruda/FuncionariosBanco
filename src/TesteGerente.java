public class TesteGerente {

    public static void main(String[] args) {
        // Dados do Gerente
        Gerente jack = new Gerente();
        jack.setNome("Jack Johoson");
        jack.setCpf("759.429.318-28");
        jack.setSalario(4569.22);


        // Visualizando os dados
        System.out.println("Nome: " + jack.getNome());
        System.out.println("CPF: " + jack.getCpf());
        System.out.println("Salário: " + jack.getSalario());


        // Verificando autenticação de senha
        jack.setSenha(3599);  // senha diferente da autenticado, resultado false
        boolean autenticou = jack.autentica(2359);  // senha autenticada
        System.out.println("Autenticou: " + autenticou);

        // Visualizando bonificação do gerente
        System.out.println("Bonificação Gerente: " + jack.getBonificacao());
    }

}
