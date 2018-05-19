package br.tests.FederacaoJudo;

import modelo.CadastrarAluno;
import modelo.Pessoa;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

public class CadastrarAlunoTest {
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
                p = null;
	}
        
        @Test
        public void testcadastroAlunoValido(){
            
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
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertTrue("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testcadastroAlunoInvalido(){
            
            p.setNomeCompleto("");
            p.setNomeMae("");
            p.setNomePai("");
            p.setCatDiv("");
            p.setCurriculun("");
            p.setDataOutorga("");
            p.setFoto3x4("");
            p.setGraduacaoAtual("");
            p.setIdade(-1);
            p.setPeso((float) 0.3);
            p.setSexo("");
            p.setStatusPag(0);
            p.setTelefone("");
            p.setCpf("");
            
            assertFalse("Nao Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testNomeAlunoInvalido(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa1");
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
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testNomeMaeAlunoInvalido(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurind2a Din1");
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
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testNomePaiAlunoInvalido(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Dam1iao Jose de Sous1a");
            p.setCatDiv("nao definido");
            p.setCurriculun("nenhum curriculun");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testDivisaoAlunoInvalido(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("");
            p.setCurriculun("nenhum curriculun");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testCurriculunAlunoInvalido(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nenhuma");
            p.setCurriculun("");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testDataOurtogaAlunoInvalida(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nenhuma");
            p.setCurriculun("sem");
            p.setDataOutorga("10/12/201");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testFotoAlunoInvalida(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nenhuma");
            p.setCurriculun("sem");
            p.setDataOutorga("10/12/2017");
            p.setFoto3x4("");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testGraduacaoAlunoInvalida(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nenhuma");
            p.setCurriculun("sem");
            p.setDataOutorga("10/12/2017");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testIdadeAlunoInvalida(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nenhuma");
            p.setCurriculun("sem");
            p.setDataOutorga("10/12/2017");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("nenhuma");
            p.setIdade(-1);
            p.setPeso((float) 78.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testPesoAlunoInvalido(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nenhuma");
            p.setCurriculun("sem");
            p.setDataOutorga("10/12/2017");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("nenhuma");
            p.setIdade(21);
            p.setPeso((float) 0.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testSexoAlunoInvalido(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nenhuma");
            p.setCurriculun("sem");
            p.setDataOutorga("10/12/2017");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("nenhuma");
            p.setIdade(21);
            p.setPeso((float) 73.3);
            p.setSexo("");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testStatusPagAlunoInvalido(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nenhuma");
            p.setCurriculun("sem");
            p.setDataOutorga("10/12/2017");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("nenhuma");
            p.setIdade(21);
            p.setPeso((float) 73.3);
            p.setSexo("M");
            p.setStatusPag(-1);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testTelefoneAlunoInvalido(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nenhuma");
            p.setCurriculun("sem");
            p.setDataOutorga("10/12/2017");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("nenhuma");
            p.setIdade(21);
            p.setPeso((float) 73.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-272");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testCPFAlunoInvalido(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nenhuma");
            p.setCurriculun("sem");
            p.setDataOutorga("10/12/2017");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("nenhuma");
            p.setIdade(21);
            p.setPeso((float) 73.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117300");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
}
