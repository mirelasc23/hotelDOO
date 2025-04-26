package model;

public class Funcionario  extends Pessoa{
    private String usuario, senha;

    public Funcionario() {
    }

    public Funcionario(int id, String usuario, String senha, String nome, String fone1, 
            String fone2, String email, String cep, String logradouro, 
            String bairro, String cidade, String complemento, String cpf, 
            String rg, String dataCadastro, String obs, char status) {
        super(nome, fone1, fone2, email, cep, logradouro, bairro, cidade, complemento, cpf, rg, obs, dataCadastro, id, status);
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario: " + super.getNome() + "\nid: " + super.getId();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
