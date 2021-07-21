public class Escolaridade {

    private String nivelEscolaridade;

    public Escolaridade(String nivelEscolaridade) {
        if (nivelEscolaridade != null)
            this.nivelEscolaridade = nivelEscolaridade;
    }

    public String getNivelEscolaridade() {
        return nivelEscolaridade;
    }

    public void setNivelEscolaridade(String nivelEscolaridade) {
        if (nivelEscolaridade != null)
            this.nivelEscolaridade = nivelEscolaridade;
    }
}