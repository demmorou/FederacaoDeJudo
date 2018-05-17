package br.tests.FederacaoJudo;

import modelo.Cadastro;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

public class CadastroAlunoTests {
    Cadastro a;
   
        @Before
	public void setup() {
		a = new Cadastro();
	}

	@After
	public void teardown() {
		a = null;
	}
        
        @Test
	public void testCadastroAlunoValido(){
            assertTrue("Deveria cadastrar!", a.CadAluno("07115789312", "Deusimar Damião de Sousa", "Laurinda Diniz", (float) 10.1));
            
        }
        
        @Test
        public void testCadastroAlunoInvalido(){
            assertFalse("Nao deveria passar!", a.CadAluno("60985117300", "Deusimar", "Laurinda", (float) 1.0));
        }
}
