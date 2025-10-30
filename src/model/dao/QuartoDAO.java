package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Quarto;

public class QuartoDAO implements InterfaceDAO<Quarto>{

    @Override
    public void create(Quarto objeto) {
        String sqlInstrucao = "insert into produto_copa (decricao, valor, obs) values(?, ?, ?)";
        
        Connection conexao = ConnectionFactoty.getConnection();    
        PreparedStatement pstm = null;
        
        try {        
            pstm = conexao.prepareStatement(sqlInstrucao);
            
            pstm.setString(1, objeto.getDescricao());
            pstm.setFloat(2, objeto.getValor());
            pstm.setString(3, objeto.getObs());
            
            JOptionPane.showMessageDialog(null, objeto);
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            ConnectionFactoty.closeConnecition(conexao, pstm);
        }
    }

    @Override
    public Quarto retrieve(int id) {
        String sqlInstrucao = "select id, decricao, valor, obs, status"
                + " from produto_copa where id = ?";
        
        Connection conexao = ConnectionFactoty.getConnection();    
        JOptionPane.showMessageDialog(null, "conexao ok");
        JOptionPane.showMessageDialog(null, conexao);
        PreparedStatement pstm = null;
        ResultSet rst = null;
        Quarto quarto = new Quarto();
        
        try{
            pstm = conexao.prepareStatement(sqlInstrucao);
            pstm.setInt(1, id);
            rst = pstm.executeQuery();
            
            while (rst.next()) {  
                System.out.println(rst);
                quarto.setId(rst.getInt("id"));
                quarto.setDescricao(rst.getString("decricao"));
                quarto.setValor(rst.getFloat("valor"));
                quarto.setObs(rst.getString(4));
                quarto.setStatus(rst.getString(5).charAt(0));
                
                JOptionPane.showMessageDialog(null, quarto);
            }
            
        }catch(SQLException ex) {
            ex.printStackTrace();
        } finally{
            ConnectionFactoty.closeConnecition(conexao, pstm);
            
        }
        return quarto;
    }

    @Override
    public List<Quarto> retrieve(String atributo, String valor) {
        String sqlInstrucao = "select id, decricao, valor, obs, status"
                + " from produto_copa where " + atributo + " like ? COLLATE utf8mb4_unicode_ci";
        Connection conexao = ConnectionFactoty.getConnection();    
        PreparedStatement pstm = null;
        ResultSet rst = null;
        List<Quarto> quartos = new ArrayList<>();

        try{
            pstm = conexao.prepareStatement(sqlInstrucao);
            pstm.setString(1, "%" + valor + "%");
            rst = pstm.executeQuery();
            
            while (rst.next()) {    
                Quarto quarto = new Quarto();
                quarto.setId(rst.getInt("id"));
                quarto.setDescricao(rst.getString("decricao"));
                quarto.setValor(rst.getFloat("valor"));
                quarto.setObs(rst.getString(4));
                quarto.setStatus(rst.getString(5).charAt(0));
                quartos.add(quarto);
                
            }
            
        }catch(SQLException ex) {
            ex.printStackTrace();
        } finally{
            ConnectionFactoty.closeConnecition(conexao, pstm);            
        }
        
        return quartos;
    }

    @Override
    public void update(Quarto objeto) {
        String sqlInstrucao = "update marca set decricao = ?,"
                + " valor = ?, obs = ?, status = ? where id = ?";
        
        Connection conexao = ConnectionFactoty.getConnection();    
        PreparedStatement pstm = null;
        
        try {        
            pstm = conexao.prepareStatement(sqlInstrucao);
            
            pstm.setString(1, objeto.getDescricao());
            pstm.setFloat(2, objeto.getAndar());
            pstm.setString(3, objeto.getObs());
            pstm.setString(4, String.valueOf(objeto.getStatus()));
            pstm.setInt(5, objeto.getId());
            JOptionPane.showMessageDialog(null, objeto);
            
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            ConnectionFactoty.closeConnecition(conexao, pstm);
        }
    }

    @Override
    public void delete(Quarto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
