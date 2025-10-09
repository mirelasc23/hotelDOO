package service;

import java.util.List;
import model.Marca;
import model.dao.MarcaDAO;

public class MarcaService {
    public static void Criar(Marca objeto) {
        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.create(objeto);
    }

    
    public static Marca Carregar(int id) {
        MarcaDAO marcaDAO = new MarcaDAO();
        return marcaDAO.retrieve(id);
    }

   
    public static List<Marca> Carregar(String atributo, String valor) {
        MarcaDAO marcaDAO = new MarcaDAO();
        return marcaDAO.retrieve(atributo, valor);
    }

    
    public static void Atualizar(Marca objeto) {
        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.update(objeto);
    }

    public void deletar(Marca objeto) {
        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.delete(objeto);
    }
}
