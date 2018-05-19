/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tests.FederacaoJudo;

import modelo.Academia;
import modelo.CadastrarProfessor;
import modelo.Pessoa;
import modelo.Professor;
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author deusimar
 */
public class CadastrarProfessorTest {
    
    Pessoa p;
    Professor pr;
    CadastrarProfessor a;
    
        @Before
	public void setup() {
		pr = new Professor();
                p = new Pessoa();
                a = new CadastrarProfessor();
	}

	@After
	public void teardown() {
		p = null;
                pr = null;
                a = null;
	}
        
        @Test
        public void testCadastrarProfessorValido(){
        
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
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
            
            assertTrue("Deveria passsar!", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
        }
        
        @Test
        public void testCadastroProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
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
            
            assertFalse("Nao deveria passar!", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testNomeProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
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
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testNomeMaeProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz1");
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
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testNomePaiProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de1 Sousa");
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
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testDivisaoProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
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
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testCurriculunProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
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
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testDataOurtogaProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nao definido");
            p.setDataOutorga("10/12/201");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testFotoProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nao definido");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("");
            p.setGraduacaoAtual("estudando");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testGraducaoProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nao definido");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("");
            p.setIdade(21);
            p.setPeso((float) 78.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testIdadeProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nao definido");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("sem graduacao");
            p.setIdade(-1);
            p.setPeso((float) 78.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testPesoProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nao definido");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("sem graduacao");
            p.setIdade(21);
            p.setPeso((float) 0.3);
            p.setSexo("M");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testSexoProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nao definido");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("sem graduacao");
            p.setIdade(21);
            p.setPeso((float) 0.3);
            p.setSexo("");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testStatusPagProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nao definido");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("sem graduacao");
            p.setIdade(21);
            p.setPeso((float) 0.3);
            p.setSexo("M");
            p.setStatusPag(-1);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testTelefoneProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nao definido");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("sem graduacao");
            p.setIdade(21);
            p.setPeso((float) 0.3);
            p.setSexo("M");
            p.setStatusPag(1);
            p.setTelefone("(89)99402-272");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testCPFProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nao definido");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("sem graduacao");
            p.setIdade(21);
            p.setPeso((float) 0.3);
            p.setSexo("M");
            p.setStatusPag(1);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117300");
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testCrefProfessorInvalido(){
            
            pr.setCref(12345);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nao definido");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("sem graduacao");
            p.setIdade(21);
            p.setPeso((float) 10.3);
            p.setSexo("M");
            p.setStatusPag(1);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testLocaisTrabalhoProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nao definido");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("sem graduacao");
            p.setIdade(21);
            p.setPeso((float) 10.3);
            p.setSexo("M");
            p.setStatusPag(1);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testTipoVinculoProfessorInvalido(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("proffessor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nao definido");
            p.setDataOutorga("10/12/2014");
            p.setFoto3x4("sem foto");
            p.setGraduacaoAtual("sem graduacao");
            p.setIdade(21);
            p.setPeso((float) 10.3);
            p.setSexo("M");
            p.setStatusPag(1);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        
        
}
