package Service;/*
package Service;

import Model.Usuario;
import controller.ConnectionJBDC;

import java.sql.*;

public class UsuarioService {

    private static  final String sqlCreateTable = "DROP TABLE IF EXISTS Clinica;"
            + " CREATE TABLE Clinica "
            + "("
            + " id INT PRIMARY KEY,"
            + " Nome VARCHAR(100) NOT NULL ,"
            + " email VARCHAR(100) NOT NULL ,"
            + " senha VARCHAR(100) NOT NULL,"
            + " nivelAcesso BIT NOT NULL ) ;";



    private static  final String sqlInsert = (
            "INSERT INTO Clinica( id ,Nome, email, senha, nivelAcesso) "
                    + " VALUES ( ?,?,?,?,?);");

    private static final String sqlDelete = (
            "DELETE FROM Clinica WHERE id = ?"
            );



    public static void main(String[] args) throws SQLException {

        Usuario usuario1 = new Usuario( 1,"Jose" , "email@email" , "123456" ,true);
        Usuario usuario2 = new Usuario(2,"Joao" , "email2@gmail.com" , "123456", false);
        Usuario usuario3 = new Usuario(3,"Maria" , "email3@gmail.com" , "123456", false);




            Connection connection = null;

        try {
            connection = .getConnection();
            Statement stmt = connection.createStatement();



            stmt.execute(sqlCreateTable);

            //Usuario 1
            PreparedStatement preparedStatementInsert = connection.prepareStatement(sqlInsert);
            preparedStatementInsert.setInt(1,usuario1.getId());
            preparedStatementInsert.setString(2,usuario1.getNome());
            preparedStatementInsert.setString(3,usuario1.getEmail());
            preparedStatementInsert.setString(4,usuario1.getSenha());
            preparedStatementInsert.setBoolean(5,usuario1.isNivelAcesso());
            //usuario2

            PreparedStatement preparedStatementInsert2 = connection.prepareStatement(sqlInsert);
            preparedStatementInsert2.setInt(1,usuario2.getId());
            preparedStatementInsert2.setString(2,usuario2.getNome());
            preparedStatementInsert2.setString(3,usuario2.getEmail());
            preparedStatementInsert2.setString(4,usuario2.getSenha());
            preparedStatementInsert2.setBoolean(5,usuario2.isNivelAcesso());

            //usuario3
            PreparedStatement preparedStatementInsert3 = connection.prepareStatement(sqlInsert);
            preparedStatementInsert3.setInt(1,usuario3.getId());
            preparedStatementInsert3.setString(2,usuario3.getNome());
            preparedStatementInsert3.setString(3,usuario3.getEmail());
            preparedStatementInsert3.setString(4,usuario3.getSenha());
            preparedStatementInsert3.setBoolean(5,usuario3.isNivelAcesso());

            //deleção usuario
            PreparedStatement preparedStatementDelete = connection.prepareStatement(sqlDelete);
            preparedStatementDelete.setString(1,"2");


            preparedStatementInsert.execute();
            preparedStatementInsert2.execute();
            preparedStatementInsert3.execute();

            preparedStatementDelete.execute();




            ResultSet rs = stmt.executeQuery("SELECT * FROM Clinica");

            while(rs.next()) {
                System.out.println(rs.getInt(1) + " - "
                        + rs.getString(2) + " - "
                        + rs.getString(3) + " - "
                        + rs.getString(4) + " - "
                        + rs.getBoolean(5)



                );
            }



            //Fecha a Conexão




            // Tratamento de erro
        } catch (SQLException e) {
            System.err.println("Não foi possivel conectar no Banco de Dados");
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            System.err.println("O Driver JDBC não foi encontrado!");
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {

            connection.close();
        }

    }


}
*/
