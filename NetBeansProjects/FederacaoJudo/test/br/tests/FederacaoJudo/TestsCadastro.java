package br.tests.FederacaoJudo;

import modelo.Aluno;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestsCadastro {
    Aluno a;
   
        @Before
	public void setup() {
		a = new Aluno();
	}

	@After
	public void teardown() {
		a = null;
	}
        
        @Test
	public void testJogadaValidaVezJogador(){
            
            
        }
}
