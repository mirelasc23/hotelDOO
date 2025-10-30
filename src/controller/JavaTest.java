package controller;

import java.util.List;
import model.Marca;
import model.dao.MarcaDAO;

public class JavaTest {
    public void retornaMarca(){
        MarcaDAO marcaDAO = new MarcaDAO();
        
        List<Marca> marcas =  marcaDAO.retrieveAll();
        for (Marca marca : marcas) {
            System.out.println(marca.getDescricao());
        }
    }
}
