import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    @Test
    void deveRetornarPaisFuncionario(){
        Funcionario funcionario = new Funcionario();
        Departamento departamento = new Departamento(new Funcionario());
        Grupo grupo = new Grupo(new Funcionario());
        Pais pais = new Pais("BR");
        Empresa empresa = new Empresa(grupo);

        grupo.setSede(pais);
        departamento.setEmpresa(empresa);
        funcionario.setAlocacao(departamento);
        assertEquals("BR", funcionario.getPaisDeAlocacaoFuncionario());
    }

    @Test
    void deveRetornarPaisNaoDefinido(){
        Funcionario funcionario = new Funcionario();
        Departamento departamento = new Departamento(new Funcionario());
        Grupo grupo = new Grupo(new Funcionario());
        Empresa empresa = new Empresa(grupo);

        departamento.setEmpresa(empresa);
        funcionario.setAlocacao(departamento);
        assertEquals("País desconhecido", funcionario.getPaisDeAlocacaoFuncionario());
    }


    @Test
    void deveRetornarEstadoDaFilial(){
        Funcionario coordenador = new Funcionario();
        Filial filial = new Filial(new Cidade(new Estado("RJ")));

        coordenador.setCoordenacao(filial);
        assertEquals("RJ", coordenador.getEstadoDaFilialDoCoordenador());
    }

    @Test
    void deveRetornarExcecaoEstadoDaFilial(){
        try{
            Funcionario coordenador = new Funcionario();
            Filial filial = new Filial(new Cidade(null));
            coordenador.setCoordenacao(filial);

            coordenador.getEstadoDaFilialDoCoordenador();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("O campo estado é obrigatório", e.getMessage());
        }

    }

}