package br.tests.FederacaoJudo;

/**
 *
 * @author deusimar
 */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  CadastrarAlunoTest.class,
  CadastrarAcademiaTest.class,
  CadastrarProfessorTest.class,
  UpdateAcademiaTest.class,
  UpdateAlunoTest.class
})
public class SuiteTest {

}
