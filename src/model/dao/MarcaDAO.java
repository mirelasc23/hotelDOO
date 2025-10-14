package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Marca;

public class MarcaDAO implements InterfaceDAO<Marca>{

    @Override
    public void create(Marca objeto) {
        String sqlInstrucao = "insert into marca (descricao) values(?)";
        
        Connection conexao = ConnectionFactoty.getConnection();    
        PreparedStatement pstm = null;
        
        try {        
            pstm = conexao.prepareStatement(sqlInstrucao);
            
            pstm.setString(1, objeto.getDescricao());
            
            JOptionPane.showMessageDialog(null, objeto);
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            ConnectionFactoty.closeConnecition(conexao, pstm);
        }
    
    }

    @Override
    public Marca retrieve(int id) {
        String sqlInstrucao = "select id, descricao, status"
                + " from marca where id = ?";
        
        Connection conexao = ConnectionFactoty.getConnection();    
        JOptionPane.showMessageDialog(null, "conexao ok");
        JOptionPane.showMessageDialog(null, conexao);
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Marca marca = new Marca();
        
        try{
            pstm = conexao.prepareStatement(sqlInstrucao);
            pstm.setInt(1, id);
            rst = pstm.executeQuery();
            
            while (rst.next()) {  
                System.out.println(rst);
                marca.setId(rst.getInt("id"));
                marca.setDescricao(rst.getString("descricao"));
                marca.setStatus(rst.getString(3).charAt(0));
                
                JOptionPane.showMessageDialog(null, marca);
            }
            
        }catch(SQLException ex) {
            ex.printStackTrace();
        } finally{
            ConnectionFactoty.closeConnecition(conexao, pstm);
            
        }
        return marca;
    }

    @Override
    public List<Marca> retrieve(String atributo, String valor) {
        String sqlInstrucao = "select id, descricao, status"
                + " from marca where " + atributo + " like ? COLLATE utf8mb4_unicode_ci";
        Connection conexao = ConnectionFactoty.getConnection();    
        JOptionPane.showMessageDialog(null, "conexao ok");
        JOptionPane.showMessageDialog(null, conexao);
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Marca> marcas = new ArrayList<>();

        try{
            pstm = conexao.prepareStatement(sqlInstrucao);
            pstm.setString(1, "%" + valor + "%");
            rst = pstm.executeQuery();
            
            while (rst.next()) {    
                Marca marca = new Marca();
                marca.setId(rst.getInt("id"));
                marca.setDescricao(rst.getString("descricao"));
                marca.setStatus(rst.getString(3).charAt(0));
                marcas.add(marca);
                
                
                JOptionPane.showMessageDialog(null, "cadastro obtido");
            }
            
        }catch(SQLException ex) {
            ex.printStackTrace();
        } finally{
            ConnectionFactoty.closeConnecition(conexao, pstm);            
        }
        
        return marcas;
    }

    @Override
    public void update(Marca objeto) {
        String sqlInstrucao = "update marca set descricao = ?,"
                + "  status = ? where id = ?";
        
        Connection conexao = ConnectionFactoty.getConnection();    
        PreparedStatement pstm = null;
        
        try {        
            pstm = conexao.prepareStatement(sqlInstrucao);
            
            pstm.setString(1, objeto.getDescricao());
            pstm.setString(2, String.valueOf(objeto.getStatus()));
            pstm.setInt(3, objeto.getId());
            JOptionPane.showMessageDialog(null, objeto);
            
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            ConnectionFactoty.closeConnecition(conexao, pstm);
        }
    }

    @Override
    public void delete(Marca objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
