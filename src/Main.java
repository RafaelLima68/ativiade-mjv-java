import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Cadastro> cadastros = new LinkedHashSet<>();

        Cadastro cadastroA = new Cadastro();

        cadastroA.setNome("Rafael");
        cadastroA.setCpf("852.963.714-30");
        cadastroA.setSexo("Masculino");
        cadastroA.setLogradouro("Av. Orlando Gomes");
        cadastroA.setNumero("382");
        cadastroA.setBairro("Piatã");
        cadastroA.setComplemento("C 10");
        cadastroA.setCidade("Salvador");
        cadastroA.setEstado("BA");
        cadastroA.setEmail("rafael@meuemail.com");
        cadastroA.setTelefone(71999999999L);
        cadastroA.setCelular(71999999999L);
        cadastroA.setCelularWhats(true);
        cadastroA.setProfissao("Desenvolvedor Salesforce");
        cadastroA.setEmpresa("Consult Premium");
        cadastroA.setSalario(5.000);
        cadastroA.setEmpregoAtual(false);
        cadastroA.setPretencaoMinima(4.000);
        cadastroA.setPretencaoMaximo(6.000);
        cadastroA.setHabilidade("Apex");

        Cadastro cadastroB = new Cadastro();

        cadastroB.setNome("Ana Paula");
        cadastroB.setCpf("489.369.147-30");
        cadastroB.setSexo("feminino");
        cadastroB.setLogradouro("Rua Sátiro Dias");
        cadastroB.setNumero("101");
        cadastroB.setBairro("Montese");
        cadastroB.setComplemento("Não possui");
        cadastroB.setCidade("Fortaleza");
        cadastroB.setEstado("CE");
        cadastroB.setEmail("ana@meuemail.com");
        cadastroB.setTelefone(859888888888L);
        cadastroB.setCelular(859888888888L);
        cadastroB.setCelularWhats(false);
        cadastroB.setProfissao("Fisioterapeuta");
        cadastroB.setEmpresa("Hospital SARAH");
        cadastroB.setSalario(4.000);
        cadastroB.setEmpregoAtual(true);
        cadastroB.setPretencaoMinima(6.000);
        cadastroB.setPretencaoMaximo(8.000);
        cadastroB.setHabilidade(" ");

        cadastros.add(cadastroA);
        cadastros.add(cadastroB);

        GerarCSV csv = new GerarCSV();
        csv.textoCsv(cadastros);



    }
}