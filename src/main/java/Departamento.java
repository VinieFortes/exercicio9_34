public class Departamento {
    private Empresa empresa;
    private Funcionario chefe;

    public Departamento(Funcionario chefe) {
        if(chefe != null)
            this.chefe = chefe;
    }

    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Funcionario getChefe() {
        return chefe;
    }
    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public String getEscolaridadeChefeDepartamento(){
        if (chefe != null){
            return chefe.getEscolaridadeFuncionario();
        }
        throw new IllegalArgumentException("O campo chefe é obrigatório");
    }
}