package model;

public class Fornecedor extends Pessoa{
    private String razaoSocial, cnpj, inscricaoEstadual, contato;

    public Fornecedor() {
    }

    public Fornecedor(String razaoSocial, String cnpj, String inscricaoEstadual, String contato, String nome, String fone1, String fone2, String email, String cep, String logradouro, String bairro, String cidade, String complemento, String cpf, String rg, String obs, String dataCadastro, int id, char status) {
        super(nome, fone1, fone2, email, cep, logradouro, bairro, cidade, complemento, cpf, rg, obs, dataCadastro, id, status);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "cnpj=" + cnpj + ", contato=" + contato + '}';
    }

    
    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
    
}
