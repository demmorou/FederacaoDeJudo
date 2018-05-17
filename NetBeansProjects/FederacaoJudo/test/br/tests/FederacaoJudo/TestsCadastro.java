package br.tests.FederacaoJudo;

import modelo.Cadastro;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

public class TestsCadastro {
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
	public void CPFValido(){
            
            assertTrue("Nao deveria cadastrar!", a.CadAluno("60985117303"));
            
        }
        
        @Test
        public void CPFInvalido(){
            assertFalse("Nao deveria passar! CPF Invalido", a.CadAluno("60985117300"));
            assertFalse("Nao deveria cadastrar! CPF Grande", a.CadAluno("609851173033"));
        }
}
