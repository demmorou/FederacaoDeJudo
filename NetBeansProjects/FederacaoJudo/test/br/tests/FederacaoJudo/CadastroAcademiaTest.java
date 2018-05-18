package br.tests.FederacaoJudo;

import modelo.Academia;
import modelo.CadastrarAcademia;
import org.junit.After;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author deusimar
 */
public class CadastroAcademiaTest {
    
        CadastrarAcademia a; 
        Academia ac;
    
        @Before
        public void setup() {
            a = new CadastrarAcademia();
            ac = new Academia();
        }

        @After
        public void teardown() {
            a = null;
        }
        
        @Test
        public void testCadastroAcademiaValido(){
            
            ac.setBairro("Junco");
            ac.setCep("64607-755");
            ac.setCidade("Picos");
            ac.setEstado("Piauí");
            ac.setNomeAcademia("Academia Do Vale");
            ac.setNumero(4045);
            ac.setRua("Av. Senador Helvídio Nunes");
            
            assertTrue("Deveria Passar", a.DadosCadastroAcademia(ac));
            
        }
        
        @Test
        public void testCadastroAcademiaInvalido(){
            
            ac.setBairro("");
            ac.setEstado("Piauí");
            ac.setCep("64607-755");
            ac.setCidade("Picos");
            ac.setNomeAcademia("Academia Do Vale");
            ac.setNumero(4045);
            ac.setRua("Av. Senador Helvídio Nunes");
            
            assertFalse("Nao Deveria Passar", a.DadosCadastroAcademia(ac));
            
        }
}
