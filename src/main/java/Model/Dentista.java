package Model;

public class Dentista {

    private int id;
    private String nome;
    private String email;
    private String numMatricula;
    private int atendeConvenio;

    public Dentista(int id, String nome, String email, String numMatricula, int atendeConvenio) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.numMatricula = numMatricula;
        this.atendeConvenio = atendeConvenio;
    }
    public Dentista( String nome, String email, String numMatricula, int atendeConvenio) {
        this.nome = nome;
        this.email = email;
        this.numMatricula = numMatricula;
        this.atendeConvenio = atendeConvenio;
    }


    public Dentista(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public int getAtendeConvenio() {
        return atendeConvenio;
    }

    public void setAtendeConvenio(int atendeConvenio) {
        this.atendeConvenio = atendeConvenio;
    }
}
