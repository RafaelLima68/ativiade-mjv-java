import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Cadastro> cadastroSet = new LinkedHashSet<>();

        Cadastro cadastros = new Cadastro();

        cadastros.setNome("Rafael");
        cadastros.setCpf("852.963.714-30");
        cadastros.setSexo("Masculino");
        cadastros.setLogradouro("Av. Orlando Gomes");
        cadastros.setNumero("382");
        cadastros.setBairro("Piatã");
        cadastros.setComplemento("C 10");
        cadastros.setCidade("Salvador");
        cadastros.setEstado("BA");
        cadastros.setEmail("rafael@meuemail.com");
        cadastros.setTelefone(71999999999L);
        cadastros.setCelular(71999999999L);
        cadastros.setCelularWhats(true);
        cadastros.setProfissao("Desenvolvedor Salesforce");
        cadastros.setEmpresa("Consult Premium");
        cadastros.setSalario(5.000);
        cadastros.setEmpregoAtual(false);
        cadastros.setPretencaoMinima(4.000);
        cadastros.setPretencaoMaximo(6.000);
        cadastros.setHabilidade("Apex");

        // teste

    }
}