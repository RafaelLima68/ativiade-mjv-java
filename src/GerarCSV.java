import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Set;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;

public class GerarCSV {
    DecimalFormat decimalFormat = new DecimalFormat();
    public void textoCsv(Set<Cadastro> cadastros){
        System.out.println("**** - MEU ARQUIVO CSV - ****");

        try {
            StringBuilder conteudo = new StringBuilder();

            for(Cadastro cadastro : cadastros){
                conteudo.append(cadastro.getNome() + ";");
                conteudo.append(cadastro.getCpf() + ";");
                conteudo.append(cadastro.getSexo() + ";");
                conteudo.append(cadastro.getLogradouro() + ";");
                conteudo.append(cadastro.getNumero() + ";");
                conteudo.append(cadastro.getBairro() + ";");
                conteudo.append(cadastro.getComplemento() + ";");
                conteudo.append(cadastro.getCidade() + ";");
                conteudo.append(cadastro.getEstado() + ";");
                conteudo.append(cadastro.getEmail() + ";");
                conteudo.append(cadastro.getTelefone() + ";");
                conteudo.append(cadastro.getCelular() + ";");
                conteudo.append(cadastro.getCelularWhats() + ";");
                conteudo.append(cadastro.getProfissao() + ";");
                conteudo.append(cadastro.getEmpresa() + ";");
                conteudo.append(decimalFormat.format(cadastro.getSalario()) + ";");
                conteudo.append(cadastro.getEmpregoAtual() + ";");
                conteudo.append(decimalFormat.format(cadastro.getPretencaoMinima()) + ";");
                conteudo.append(decimalFormat.format(cadastro.getPretencaoMaximo()) + ";");
                conteudo.append(cadastro.getHabilidade() + ";");
                conteudo.append("\n");
            }
            System.out.println(conteudo.toString());

            Path arquivoDestino = Paths.get("C:\\Java\\ativiade-mjv-java\\lista-cadastro.csv");

            Files.write(arquivoDestino, conteudo.toString().getBytes(StandardCharsets.UTF_8), StandardOpenOption.CREATE);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
