package service;

import java.util.List;
import model.Modelo;
import model.dao.ModeloDAO;

public class ModeloService implements InterfaceService<Modelo>{

    @Override
    public void criar(Modelo objeto) {
        ModeloDAO modeloDAO = new ModeloDAO();
        modeloDAO.create(objeto);
    }

    @Override
    public Modelo carregar(int id) {
        ModeloDAO modeloDAO = new ModeloDAO();
        return modeloDAO.retrieve(id);
    }

    @Override
    public List<Modelo> carregar(String atributo, String valor) {
        ModeloDAO modeloDAO = new ModeloDAO();
        return modeloDAO.retrieve(atributo, valor);
    }

    @Override
    public void atualizar(Modelo objeto) {
        ModeloDAO modeloDAO = new ModeloDAO();
        modeloDAO.update(objeto);
    }

    @Override
    public void deletar(Modelo objeto) {
        ModeloDAO modeloDAO = new ModeloDAO();
        modeloDAO.delete(objeto);
    }
    
}
