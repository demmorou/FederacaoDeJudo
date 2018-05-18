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
            assertTrue("Deveria passar", a.DadosCadastroAluno("Deusimar Damião", "Laurinda Diniz", 
                    "9402-2722", "10/12/2017", 
                    "21", "nenhuma", "Damiao Jose de Sousa", 
                    "imagem", "60985117303", 
                    "Academia Sol", "10.1", 
                    "nenhuma", "M"));
        }
        
        @Test
        public void cadastroAlunoInvalido(){
            assertFalse("Nao Deveria passar", a.DadosCadastroAluno("Deusimar Damião", "Laurinda Diniz", 
                    "9402-2722", "10/12/2017", 
                    "21", "nenhuma", "Damiao José de Sousa", 
                    "path_imagem", "609851173033", 
                    "Academia Sol", "75.5", 
                    "nenhuma", "M"));
        }
        
}
