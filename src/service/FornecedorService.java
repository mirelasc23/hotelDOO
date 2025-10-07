package service;

import java.util.List;
import model.Fornecedor;
import model.dao.FornecedorDAO;

public class FornecedorService implements InterfaceService<Fornecedor>{

    @Override
    public void criar(Fornecedor objeto) {
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.create(objeto);
    }

    @Override
    public Fornecedor carregar(int id) {
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        return fornecedorDAO.retrieve(id);
    }

    @Override
    public List<Fornecedor> carregar(String atributo, String valor) {
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        return fornecedorDAO.retrieve(atributo, valor);
    }

    @Override
    public void atualizar(Fornecedor objeto) {
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.update(objeto);
    }

    @Override
    public void deletar(Fornecedor objeto) {
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.delete(objeto);
    }
    
}
