package dao.impl;

import Model.Dentista;
import dao.ConfiguracaoJDBC;
import dao.IDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class DentistaDAOH2 implements IDao<Dentista> {

   // private static final Logger logger = LogManager.getLogger(PacienteDAOH2);

    private ConfiguracaoJDBC configuracaoJDBC;

    //ConfiguracaoJDBC configurationJDBC = new ConfiguracaoJDBC("org.h2.Driver", "jdbc:h2:~/Test;INIT=RUNSCRIPT FROM 'src/main/resources/createSQL.sql'","sa","" );

    public DentistaDAOH2(ConfiguracaoJDBC configuracaoJDBC) {

        this.configuracaoJDBC = configuracaoJDBC;
    }


    @Override
    public Dentista salvar(Dentista dentista) {

        Connection connection = configuracaoJDBC.getConnection();

        Statement statement = null;

        String SQLINSERT = String.format("INSERT INTO DENTISTAS (NOME, EMAIL, NUMMATRICULA, ATENDECONVENIO) VALUES('%s','%s','%s','%S')",
                dentista.getNome(), dentista.getEmail() ,dentista.getNumMatricula() , dentista.getAtendeConvenio());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(SQLINSERT,Statement.RETURN_GENERATED_KEYS);
            //logger.info("conexao aberta");
            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next())
                dentista.setId(keys.getInt(1));
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dentista;
    }

/*    @Override
    public List<Dentista> buscarTodos() {
        return null;
    }

    @Override
    public void alterar(Dentista dentista) {

    }

    @Override
    public void excluir(int id) throws SQLException {

    }*/

    @Override
    public Dentista buscarPorId(int id) {
        Connection connection = configuracaoJDBC.getConnection();
        Statement statement = null;
        String query = String.format("SELECT * FROM DENTISTAS WHERE id = '%s'",id);
        Dentista dentista = new Dentista();

        try{
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                dentista.setId(resultSet.getInt("ID"));
                dentista.setNome(resultSet.getString("NOME"));
                dentista.setEmail(resultSet.getString("EMAIL"));
                dentista.setNumMatricula(resultSet.getString("NUMMATRICULA"));
                dentista.setAtendeConvenio(resultSet.getInt("ATENDECONVENIO"));

            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        return dentista;
    }


}