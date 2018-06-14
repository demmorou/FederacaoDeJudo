package br.tests.FederacaoJudo;

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
            p.setIdpessoa(-1);
            
            assertFalse("Nao Deveria passar", a.DadosCadastroAluno(p));
            
        }
        
        @Test
        public void testUpdateAlunoCamposVazios(){
            
            p.setNomeCompleto("");
            p.setNomeMae("");
            p.setNomePai("");
            p.setCatDiv("");
            p.setCurriculun("");
            p.setDataOutorga("");
            p.setGraduacaoAtual("");
            p.setIdade(0);
            p.setPeso((float) 20);
            p.setTelefone("");
            p.setIdpessoa(-1);
            
            assertFalse("Nao Deveria passar", a.DadosCadastroAluno(p));
           
        }
        
        @Test
        public void testUpdateAlunoNomeInvalido(){
            
            p.setNomeCompleto("Deusimar/ Damiao de Sousa Monteiro");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nenhum curriculun");
            p.setDataOutorga("10/12/2014");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setTelefone("(89)99402-2722");
            p.setIdpessoa(10);
            
            assertFalse("Não Deveria passar", a.DadosCadastroAluno(p));
            
        }
        
        
        public void testUpdateAlunoNomePaiInvalido(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa Monteiro");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao# Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nenhum curriculun");
            p.setDataOutorga("10/12/2014");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setTelefone("(89)99402-2722");
            p.setIdpessoa(10); 
            
            assertFalse("Não Deveria passar", a.DadosCadastroAluno(p));
            
        }
        
        @Test
        public void testUpdateAlunoNomeMaeInvalido(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa Monteiro");
            p.setNomeMae("Laurinda+ Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nenhum curriculun");
            p.setDataOutorga("10/12/2014");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setTelefone("(89)99402-2722");
            p.setIdpessoa(10); 
            
            assertFalse("Não Deveria passar", a.DadosCadastroAluno(p));
            
        }
        
        @Test
        public void testUpdateAlunoIdadeInvalida(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa Monteiro");
            p.setNomeMae("Laurinda+ Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nenhum curriculun");
            p.setDataOutorga("10/12/2014");
            p.setGraduacaoAtual("estudando");
            p.setIdade(9);
            p.setPeso((float) 78.3);
            p.setTelefone("(89)99402-2722");
            p.setIdpessoa(10); 
            
            assertFalse("Não Deveria passar", a.DadosCadastroAluno(p));
            
        }
        
        @Test
        public void testUpdateAlunoPesoInvalido(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa Monteiro");
            p.setNomeMae("Laurinda+ Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nenhum curriculun");
            p.setDataOutorga("10/12/2014");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 9);
            p.setTelefone("(89)99402-2722");
            p.setIdpessoa(10); 
            
            assertFalse("Não Deveria passar", a.DadosCadastroAluno(p));
            
        }
        
        @Test
        public void testUpdateAlunoTelefoneInvalido(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa Monteiro");
            p.setNomeMae("Laurinda+ Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nenhum curriculun");
            p.setDataOutorga("10/12/2014");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setTelefone("2722");
            p.setIdpessoa(10);
            
            assertFalse("Não Deveria passar", a.DadosCadastroAluno(p));
            
        }
        
}