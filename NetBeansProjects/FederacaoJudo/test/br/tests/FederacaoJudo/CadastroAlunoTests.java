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
        public void cadastroAlunoValido(){
            assertTrue("Deveria passar", a.DadosCadastroAluno("Deusimar Damião", "Laurinda Diniz", "", "", "", "", "", "", "", "", "", "", ""));
        }
        
        @Test
        public void cadastroAlunoInvalido(){
            assertFalse("Deveria passar", a.DadosCadastroAluno("Deusimar Damião", "", "", "", "", "", "", "", "", "", "", "", ""));
        }
}
