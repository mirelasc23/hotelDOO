package service;

import java.util.List;

public interface InterfaceService<T> {
    public abstract void criar(T objeto);
    public abstract T carregar(int id);
    public abstract List<T> carregar(String atributo, String valor);
    public abstract void atualizar(T objeto);
    public abstract void deletar(T objeto);
    
}