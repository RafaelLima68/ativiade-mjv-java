import java.util.Set;

public class Cadastro {
    String nome;
    String cpf;
    String sexo;
    String logradouro;
    String numero;
    String bairro;
    String complemento;
    String cidade;
    String estado;
    String email;
    Long telefone;
    Long celular;
    boolean celularWhats;
    String profissao;
    String empresa;
    Double salario;
    boolean empregoAtual;
    Double pretencaoMinima;
    Double pretencaoMaximo;
    String habilidade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getSexo(){
        return sexo;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String getLogradouro(){
        return logradouro;
    }

    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getBairro(){
        return bairro;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getComplemento(){
        return complemento;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public long getTelefone(){
        return telefone;
    }

    public void setTelefone(Long telefone){
        this.telefone = telefone;
    }

    public Long getCelular(){
        return celular;
    }

    public void setCelular(Long celular){
        this.celular = celular;
    }

    public boolean isCelularWhats(){
        return celularWhats;
    }
    public boolean getCelularWhats(){
        return celularWhats;
    }

    public void setCelularWhats(boolean celularWhats){
        this.celularWhats = celularWhats;
    }

    public String getProfissao(){
        return profissao;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public String getEmpresa(){
        return empresa;
    }

    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }

    public Double getSalario(){
        return salario;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public boolean isEmpregoAtual(){
        return empregoAtual;
    }

    public boolean getEmpregoAtual(){
        return empregoAtual;
    }

    public void setEmpregoAtual(boolean empregoAtual){
        this.empregoAtual = empregoAtual;
    }

    public Double getPretencaoMinima(){
        return pretencaoMinima;
    }

    public void setPretencaoMinima(Double pretencaoMinima){
        this.pretencaoMinima = pretencaoMinima;
    }

    public Double getPretencaoMaximo(){
        return pretencaoMaximo;
    }

    public void setPretencaoMaximo(Double pretencaoMaximo){
        this.pretencaoMaximo = pretencaoMaximo;
    }

    public String getHabilidade(){
        return habilidade;
    }

    public void setHabilidade(String habilidade){
    this.habilidade = habilidade;
    }
}
