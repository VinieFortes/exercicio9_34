import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {
    @Test
    void deveRetornarNomeDiretor(){
        Filial filial = new Filial(new Cidade(new Estado("SP")));
        Empresa empresa = new Empresa(new Grupo(new Funcionario()));
        Funcionario funcionario = new Funcionario();

        funcionario.setNomeFuncionario("Julius");
        empresa.setDiretor(funcionario);
        filial.setEmpresa(empresa);

        assertEquals("Julius", filial.getNomeDiretorDaEmpresaDeUmaFilial());
    }

    @Test
    void deveRetornarFilialSemEmpresaDefinida(){
        Filial filial = new Filial(new Cidade(new Estado("SP")));
        assertEquals("Empresa não definida", filial.getNomeDiretorDaEmpresaDeUmaFilial());
    }
}