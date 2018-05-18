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
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nenhum curriculun");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)994022722");
            p.setCpf("60985117303");
            
            assertTrue("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void cadastroAlunoInvalido(){
            
            p.setNomeCompleto("");
            
            assertFalse("Nao Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
}
