package br.tests.FederacaoJudo;

import modelo.CadastrarAluno;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

public class CadastroAlunoTests {
    CadastrarAluno a;
   
        @Before
	public void setup() {
		a = new CadastrarAluno();
	}

	@After
	public void teardown() {
		a = null;
	}
        
        @Test
	public void testNomeAlunoValido(){
            assertTrue("Deveria cadastrar!", a.nomeCompleto("Deusimar Damião de Sousa"));
            
        }
        
        @Test
        public void testNomeAlunoInvalido(){
            assertFalse("Nao deveria passar!", a.nomeCompleto("Deusimar"));
        }
        
        @Test
        public void testNomeMaeValido(){
            assertTrue("Deveria passar!", a.nomeMae("Laurinda Diniz"));
        }
        
        @Test
        public void testNomeMaeInvalido(){
            assertFalse("Nao deveria passar!", a.nomeMae("Laurinda"));
        }
        
        @Test
        public void testCPFValido(){
            assertTrue("Deveria passar!", a.CPF("60985117303"));
        }
        
        @Test
        public void testCPFInvalido(){
            assertFalse("Não Deveria passar!", a.CPF("12345678900"));
        }
        
        @Test
        public void testCPFGrande(){
            assertFalse("Não Deveria passar!", a.CPF("60985117303333"));
        }
}
