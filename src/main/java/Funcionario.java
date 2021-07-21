public class Funcionario {

    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;
    private String nome;


    public Escolaridade getEscolaridade() {
        return escolaridade;
    }
    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Departamento getAlocacao() {
        return alocacao;
    }
    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }
    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getNomeFuncionario() {
        return nome;
    }
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nome = nomeFuncionario;
    }


    public String getEscolaridadeFuncionario(){
        return escolaridade.getNivelEscolaridade();
    }

    public String getPaisDeAlocacaoFuncionario(){
        if (alocacao.getEmpresa().getGrupo().getSede() == null)
            return "País desconhecido";
        return alocacao.getEmpresa().getGrupo().getSede().getNomePais();
    }

    public String getEstadoDaFilialDoCoordenador(){
        if (coordenacao.getCidade().getEstado() == null)
            throw new IllegalArgumentException("O campo estado é obrigatório");
        return coordenacao.getCidade().getEstado().getNomeEstado();
    }
}