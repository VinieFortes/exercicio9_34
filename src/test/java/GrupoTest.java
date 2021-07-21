import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    @Test
    void deveRetornarEscolaridadePresidente(){
        Funcionario presidente = new Funcionario();
        Grupo grupo = new Grupo(presidente);
        Escolaridade escolaridade = new Escolaridade("PHD");
        presidente.setEscolaridade(escolaridade);
        grupo.setPresidente(presidente);

        assertEquals("PHD", grupo.getEscolaridadePresidente());
    }

    @Test
    void deveRetornarEscolaridadeIndefinidaPresidente(){
        Funcionario presidente = new Funcionario();
        Grupo grupo = new Grupo(presidente);
        grupo.setPresidente(presidente);

        assertEquals("Escolaridade não definida", grupo.getEscolaridadePresidente());
    }
}