public class Grupo {

    private Pais pais;
    private Funcionario presidente;

    public Grupo(Funcionario presidente) {
        if (presidente != null)
            this.presidente = presidente;
    }

    public Pais getSede() {
        return pais;
    }
    public void setSede(Pais pais) {
        this.pais = pais;
    }

    public Funcionario getPresidente() {
        return presidente;
    }
    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }

    public String getEscolaridadePresidente(){
        if (presidente.getEscolaridade() == null)
            return "Escolaridade não definida";
        return presidente.getEscolaridadeFuncionario();
    }
}