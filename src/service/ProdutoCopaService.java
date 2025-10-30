package service;

import java.util.List;
import model.ProdutoCopa;
import model.dao.ProdutoCopaDAO;

public class ProdutoCopaService implements InterfaceService<ProdutoCopa>{

    @Override
    public void Criar(ProdutoCopa objeto) {
        ProdutoCopaDAO produtoCopaDAO = new ProdutoCopaDAO();
        produtoCopaDAO.create(objeto);
    }

    @Override
    public ProdutoCopa Carregar(int id) {
        ProdutoCopaDAO produtoCopaDAO = new ProdutoCopaDAO();
        return produtoCopaDAO.retrieve(id);
    }

    @Override
    public List<ProdutoCopa> Carregar(String atributo, String valor) {
        ProdutoCopaDAO produtoCopaDAO = new ProdutoCopaDAO();
        return produtoCopaDAO.retrieve(atributo, valor);
    }

    @Override
    public void Atualizar(ProdutoCopa objeto) {
        ProdutoCopaDAO produtoCopaDAO = new ProdutoCopaDAO();
        produtoCopaDAO.update(objeto);
    }

    @Override
    public void Deletar(ProdutoCopa objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
