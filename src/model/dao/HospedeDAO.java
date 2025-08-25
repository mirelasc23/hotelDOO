package model.dao;

import java.util.List;
import model.Hospede;

public class HospedeDAO implements InterfaceDAO<Hospede>{

    @Override
    public void create(Hospede objeto) {
        String sql = "insert into hospede (default, " + objeto.getNome() + ", " + objeto.getFone1() + ", " + objeto.getFone2()+ ", " + objeto.getEmail()+ ", " + objeto.getCep()+ ", " + objeto.getLogradouro()+ ", " + objeto.getBairro()+ ", " + objeto.getCidade()+ ");";
    }

    @Override
    public Hospede retrieve(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Hospede> retrieve(String atributo, String valor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Hospede objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Hospede objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
}
