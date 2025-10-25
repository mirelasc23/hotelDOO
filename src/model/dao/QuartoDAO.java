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
        String sqlInstrucao = "insert into quarto (";
        Connection conexao = ConnectionFactoty.getConnection();
        PreparedStatement pstm = null;
        
        try{
            pstm = conexao.prepareStatement(sqlInstrucao);
            pstm.setString(1, objeto.getDescricao());
                JOptionPane.showMessageDialog(null, objeto);
            pstm.execute();
        }catch (SQLException ex){
            ex.printStackTrace();
        }finally{
            ConnectionFactoty.closeConnecition(conexao, pstm);
        }
    }

    @Override
    public Quarto retrieve(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Quarto> retrieve(String atributo, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Quarto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Quarto objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
