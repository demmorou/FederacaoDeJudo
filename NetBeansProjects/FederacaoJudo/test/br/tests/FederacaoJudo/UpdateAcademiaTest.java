package br.tests.FederacaoJudo;

import modelo.Academia;
import org.junit.After;
import org.junit.Before;
import modelo.UpdateAcademia;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 *
 * @author deusimar
 */
public class UpdateAcademiaTest {
    
    Academia a;
    UpdateAcademia up;
    
    @Before
    public void setup() {
        a = new Academia();
        up = new UpdateAcademia();
    }

    @After
    public void teardown() {
	a = null;
    }
    
    @Test
    public void testUpdateAcademiaValido(){
        
        a.setBairro("Novo Milenio");
        a.setCep("64685-000");
        a.setCidade("Marcolandia");
        a.setNomeAcademia("Academia Marcola");
        a.setNumero(279);
        a.setRua("Av. Corintio Matos");
        a.setEstado("PI");
        
        assertTrue("Deveria Passar", up.dadosUpdateAcademia(a));
    }
}
