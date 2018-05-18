package br.tests.FederacaoJudo;

import modelo.CadastrarAluno;
import modelo.Pessoa;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

public class CadastroAlunoTests {
    CadastrarAluno a;
    Pessoa p;
   
        @Before
	public void setup() {
		a = new CadastrarAluno();
                p = new Pessoa();
	}

	@After
	public void teardown() {
		a = null;
	}
        
        @Test
        public void cadastroAlunoValido(){
            
            assertTrue("Deveria passar", a.DadosCadastroAluno(p));
            
        }
        
        @Test
        public void cadastroAlunoInvalido(){
            
            assertFalse("Nao Deveria passar", a.DadosCadastroAluno(p));
            
        }
        
}
