package model;

//import java.util.Date;

public class Pessoa {
    private String nome, fone1, fone2, email, cep, logradouro, bairro, cidade,
                                complemento, cpf, rg, obs, dataCadastro;
    private int id;
    private char status;
    //private Date dataCadastro;

    public Pessoa() {
    }

    public Pessoa(String nome, String fone1, String fone2, String email, String cep, String logradouro, String bairro, String cidade, String complemento, String cpf, String rg, String obs, String dataCadastro, int id, char status) {
        this.nome = nome;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.email = email;
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
        this.cpf = cpf;
        this.rg = rg;
        this.obs = obs;
        this.dataCadastro = dataCadastro;
        this.id = id;
        this.status = status;
    }

    @Override
    public String toString() {
        return "nome = " + nome + "id = " + id;//", fone1=" + fone1 + ", fone2=" + fone2 + ", email=" + email + ", cep=" + cep + ", logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade + ", complemento=" + complemento + ", cpf=" + cpf + ", rg=" + rg + ", obs=" + obs + ", dataCadastro=" + dataCadastro + ", id=" + id + ", status=" + status + '}';
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        if((status == 'A') || (status == 'A')){
            this.status = status;
        }
        this.status = status;
        nome.toUpperCase();
    }
    

    /*public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }*/
    
    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
        
}
