package Model;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private boolean nivelAcesso;


    public Usuario(int id, String nome, String email, String senha, boolean nivelAcesso) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(boolean nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
}




