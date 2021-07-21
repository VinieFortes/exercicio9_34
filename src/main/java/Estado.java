public class Estado {

    private Pais pais;
    private String nome;

    public Estado(String nomeEstado) {
        if (nomeEstado != null)
            this.nome = nomeEstado;
    }

    public Pais getPais() {
        return pais;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNomeEstado() {
        return nome;
    }
    public void setNomeEstado(String nomeEstado) {
        this.nome = nomeEstado;
    }
}