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
        public void testCadastroProfessorEmBranco(){
            
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
        public void testNomeProfessorComNumero(){
            
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
            
            assertFalse("Nao Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testNomeProfessorEmBranco(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
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
            
            assertFalse("Nao Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testNomeProfessorCaractereEspecial(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao #");
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
            
            assertFalse("Nao Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testNomeProfessorExcedeCaractere(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
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
            
            assertFalse("Nao Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        
        @Test
        public void testNomeMaeProfessorEmBranco(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
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
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testNomeMaeProfessorComNumero(){
            
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
        public void testNomeMaeProfessorCaractereEspecial(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz#");
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
        public void testNomeMaeProfessorExcedeCaractere(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
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
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testNomePaiProfessorComNumero(){
            
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
        public void testNomePaiProfessorCaractereEspecial(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de# Sousa");
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
        public void testNomePaiProfessorExcedeCaractere(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de# Sousa");
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
        public void testCurriculunProfessorEmBranco(){
            
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
        public void testCurriculunProfessorExcedeTamanho(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
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
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testDataOurtogaProfessorInvalida(){
            
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
        public void testDataOurtogaProfessorEmBranco(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("professor");
            
            p.setNomeCompleto("Deusimar Damiao de Sousa");
            p.setNomeMae("Laurinda Diniz");
            p.setNomePai("Damiao Jose de Sousa");
            p.setCatDiv("nao definido");
            p.setCurriculun("nao definido");
            p.setDataOutorga("");
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
        public void testFotoProfessorEmBranco(){
            
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
        public void testGraducaoProfessorEmBranco(){
            
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
        public void testSexoProfessorEmBranco(){
            
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
        public void testSexoProfessorComNumero(){
            
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
            p.setSexo("Masculin0");
            p.setStatusPag(0);
            p.setTelefone("(89)99402-2722");
            p.setCpf("60985117303");
            
            assertFalse("Deveria passar", a.DadosCadastroProfessor(p, pr, "Academia Sol"));
            
        }
        
        @Test
        public void testSexoProfessorCaractereEspecial(){
            
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
            p.setSexo("Masculin#");
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
        public void testCrefProfessorMaior(){
            
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
        public void testCrefProfessorMenor(){
            
            pr.setCref(123);
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
        public void testLocaisTrabalhoProfessorEmBranco(){
            
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
        public void testLocaisTrabalhoProfessorExcedeTamanho(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("trabalhou em todos os estados brasileiros. trabalhou na china, nos estados unidos da america, no canada, na argentina, no uruguai");
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
            p.setPeso((float) 70.3);
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
        
        @Test
        public void testTipoVinculoProfessorEmBranco(){
            
            pr.setCref(1234);
            pr.setLocaisDeTrabalho("nunca trabalhou");
            pr.setVinculoComAcademia("");
            
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
