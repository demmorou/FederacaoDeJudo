package br.tests.FederacaoJudo;

import modelo.CadastrarAluno;
import modelo.Pessoa;
import modelo.VerificarString;
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
        public void testcadastroAlunoEmBranco(){
            
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
        public void testNomeAlunoComNumero(){
            
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
        public void testNomeAlunoEmBranco(){
            
            p.setNomeCompleto("");
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
        public void testNomeAlunoExcedeTamanho(){
            
            p.setNomeCompleto("Deusimar  Damiao de Sousa Alencar Fontes Macedo de Carvalho de Sousa Alencar Fontes Macedo de Carvalho");
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
        public void testNomeAlunoComCaractereEspecial(){
            
            p.setNomeCompleto("Deusimar# Damiao de Sousa");
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
        public void testNomeMaeAlunoComNumero(){
            
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
        public void testNomeMaeAlunoEmBranco(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("");
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
        public void testNomeMaeAlunoExeceTamanho(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz Sousa Macedo Carvalho Fontes de Alencar Macedo Carvalho Fontes de Alencar");
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
        public void testNomeMaeComCaractereEspecial(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz #Sousa");
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
            
            assertFalse("Nao Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testNomePaiComNumero(){
            
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
            
            assertFalse("Nao Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testNomePaiComCaractereEspecial(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sous#a");
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
            
            assertFalse("Nao Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testNomePaiExecedeTamanho(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa Macedo Carvalho Fontes de Alencar Macedo Carvalho Fontes de Alencar");
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
            
            assertFalse("Nao Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testCurriculunExecedeTamanho(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("Medio/Sub 15");
            p.setCurriculun("estudou em todos os estados brasileiros. estudou na china, nos estados unidos da america, no canada, na argentina, no uruguai");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Nao Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testDataOurtogaInexistente(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nenhuma");
            p.setCurriculun("sem");
            p.setDataOutorga("30/02/2012");
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
        public void testDataOurtogaInvalida(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nenhuma");
            p.setCurriculun("sem");
            p.setDataOutorga("30/022012");
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
        public void testDataOurtogaEmBranco(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nenhuma");
            p.setCurriculun("sem");
            p.setDataOutorga("");
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
        public void testFotoAlunoSemCaminho(){
            
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
        public void testGraduacaoEmbranco(){
            
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
        public void testDataNascimentoInvalida(){
            
            assertFalse("Deveria passar", new VerificarString().data("30/02/2018"));
            
        }
        
        @Test
        public void testPesoAlunoMenor(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nenhuma");
            p.setCurriculun("sem");
            p.setDataOutorga("10/12/2017");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("nenhuma");
            p.setIdade(21);
            p.setPeso((float) 14.99);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testPesoAlunoMaior(){
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nenhuma");
            p.setCurriculun("sem");
            p.setDataOutorga("10/12/2017");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("nenhuma");
            p.setIdade(21);
            p.setPeso((float) 501.00);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testSexoAlunoEmBranco(){
            
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
        public void testSexoAlunoComNumero(){
            
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
            p.setSexo("Masculin0");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroAluno(p, "Academia Sol"));
            
        }
        
        @Test
        public void testSexoAlunoExecedecaracteres(){
            
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
            p.setSexo("Masculinoo");
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
        public void testTelefoneAlunoIncompleto(){
            
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
        public void testTelefoneAlunoEmBranco(){
            
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
