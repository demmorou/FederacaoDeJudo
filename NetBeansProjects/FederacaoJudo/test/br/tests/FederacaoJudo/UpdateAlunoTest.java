package br.tests.FederacaoJudo;

import modelo.CadastrarAluno;
import modelo.Pessoa;
import modelo.UpdateAluno;
import org.junit.After;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author deusimar
 */
public class UpdateAlunoTest {
    
    UpdateAluno a;
    Pessoa p;
   
        @Before
	public void setup() {
		a = new UpdateAluno();
                p = new Pessoa();
	}

	@After
	public void teardown() {
		a = null;
                p = null;
	}
        
        @Test
        public void testUpdateAlunoValido(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa Monteiro");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nenhum curriculun");
            p.setDataOutorga("10/12/2014");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setTelefone("(89)99402-2722");
            p.setIdpessoa(10); // Id_pessoa deve existir
            
            assertTrue("Deveria passar", a.DadosCadastroAluno(p));
            
        }
        
        @Test
        public void testUpdateAlunoNaoExistente(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nenhum curriculun");
            p.setDataOutorga("10/12/2014");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setTelefone("(89)99402-2722");
            p.setIdpessoa(11);
            
            assertFalse("Nao Deveria passar", a.DadosCadastroAluno(p));
            
        }
        
}
