public class Filial {

    private Cidade cidade;
    private Empresa empresa;

    public Filial(Cidade cidade) {
        if (cidade != null)
            this.cidade = cidade;
    }

    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getNomeDiretorDaEmpresaDeUmaFilial(){
        if(empresa != null)
            return empresa.getDiretor().getNomeFuncionario();
        else
            return "Empresa não definida";
    }
}