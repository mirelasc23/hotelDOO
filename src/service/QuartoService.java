package service;

import java.util.List;
import model.Quarto;
import model.dao.QuartoDAO;

public class QuartoService implements InterfaceService<Quarto>{

    @Override
    public void Criar(Quarto objeto) {
        QuartoDAO quartoDAO = new QuartoDAO();
        quartoDAO.create(objeto);
    }

    @Override
    public Quarto Carregar(int id) {
        QuartoDAO quartoDAO = new QuartoDAO();
        return quartoDAO.retrieve(id);
    }

    @Override
    public List<Quarto> Carregar(String atributo, String valor) {
        QuartoDAO quartoDAO = new QuartoDAO();
        return quartoDAO.retrieve(atributo, valor);
    }

    @Override
    public void Atualizar(Quarto objeto) {
        QuartoDAO quartoDAO = new QuartoDAO();
        quartoDAO.update(objeto);
    }

    @Override
    public void Deletar(Quarto objeto) {
        QuartoDAO quartoDAO = new QuartoDAO();
        quartoDAO.delete(objeto);
    }
    
}
