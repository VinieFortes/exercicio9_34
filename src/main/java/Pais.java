public class Pais {

    private String nome;

    public Pais(String nomePais) {
        if (nomePais != null)
            this.nome = nomePais;
    }

    public String getNomePais() {
        return nome;
    }
    public void setNomePais(String nomePais) {
        this.nome = nomePais;
    }
}