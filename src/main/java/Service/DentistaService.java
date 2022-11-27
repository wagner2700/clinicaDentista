package Service;

import Model.Dentista;
import dao.IDao;

import java.sql.SQLException;

public class DentistaService{

    private IDao<Dentista> dentistaIdao;

    public DentistaService(IDao<Dentista> dentistaIdao){

        this.dentistaIdao = dentistaIdao;
    }

    public Dentista salvar(Dentista dentista)  {
        return  dentistaIdao.salvar(dentista);
    }

    public Dentista buscarPorId(Integer id)  {
        return dentistaIdao.buscarPorId(id);
    }

}