package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Funcionario;

public class FuncionarioDAO implements InterfaceDAO<Funcionario>{

    @Override
    public void create(Funcionario objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Funcionario retrieve(int id) {
        String sqlInstrucao = "select id, nome,"
                + " fone, fone2, email, cep, logradouro, bairro,"
                + " cidade, complemento, data_cadastro, cpf, rg,"
                + " obs, status, razao_social,"
                + " cnpj, inscricao_estadual, contato, sexo"
                + " from funcionario where id = ?";
        
        Connection conexao = ConnectionFactoty.getConnection();    
        JOptionPane.showMessageDialog(null, "conexao ok");
        JOptionPane.showMessageDialog(null, conexao);
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Funcionario funcionario = new Funcionario();
        
        try{
            pstm = conexao.prepareStatement(sqlInstrucao);
            pstm.setInt(1, id);
            rst = pstm.executeQuery();
            
            while (rst.next()) {  
                System.out.println(rst);
                funcionario.setId(rst.getInt("id"));
                funcionario.setNome(rst.getString("nome"));
                funcionario.setFone1(rst.getString("fone"));
                funcionario.setFone2(rst.getString("fone2"));
                funcionario.setEmail(rst.getString(5));
                funcionario.setCep(rst.getString(6));
                funcionario.setLogradouro(rst.getString(7));
                funcionario.setBairro(rst.getString(8));
                funcionario.setCidade(rst.getString(9));
                funcionario.setComplemento(rst.getString(10));
                funcionario.setDataCadastro(rst.getString(11));
                funcionario.setCpf(rst.getString(12));
                funcionario.setRg(rst.getString(13));
                funcionario.setObs(rst.getString(14));
                funcionario.setStatus(rst.getString(15).charAt(0));
                funcionario.setRazaoSocial(rst.getString(16));
                funcionario.setCnpj(rst.getString(17));
                funcionario.setInscricaoEstadual(rst.getString(18));
                funcionario.setContato(rst.getString(19));
                funcionario.setSexo(rst.getString(20).charAt(0));
                
                JOptionPane.showMessageDialog(null, fornecedor);
            }
            
        }catch(SQLException ex) {
            ex.printStackTrace();
        } finally{
            ConnectionFactoty.closeConnecition(conexao, pstm);
            
        }
        return fornecedor;
    }

    @Override
    public List<Funcionario> retrieve(String atributo, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Funcionario objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Funcionario objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 }

    @Override
    public List<Funcionario> retrieve(String atributo, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Funcionario objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Funcionario objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
