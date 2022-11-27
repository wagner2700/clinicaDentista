package dao;

import java.sql.SQLException;
import java.util.List;

public interface IDao <T>{

    public T salvar(T t);
/*    List<T>buscarTodos() ;
    void alterar(T t) ;
    void excluir(int id) throws SQLException;*/
    public T buscarPorId(int id) ;



}
