import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {
    @Test
    void deveRetonarNivelEscolaridadeChefe(){
        Funcionario funcionario = new Funcionario();
        Departamento dep = new Departamento(funcionario);
        Escolaridade escolaridade = new Escolaridade("PHD");

        funcionario.setEscolaridade(escolaridade);

        assertEquals("PHD", dep.getEscolaridadeChefeDepartamento());
    }

    @Test
    void deveRetonarNullChefe(){
        try{
            Departamento departamento = new Departamento(null);
            departamento.getEscolaridadeChefeDepartamento();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("O campo chefe é obrigatório", e.getMessage());
        }


    }

}