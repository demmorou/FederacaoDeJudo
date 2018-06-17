package br.tests.FederacaoJudo;

import modelo.Academia;
import org.junit.After;
import org.junit.Before;
import modelo.UpdateAcademia;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 *
 * @author deusimar
 */
public class UpdateAcademiaTest {
    
    Academia a;
    UpdateAcademia up;
    
    @Before
    public void setup() {
        a = new Academia();
        up = new UpdateAcademia();
    }

    @After
    public void teardown() {
	a = null;
    }
    
    @Test
    public void testUpdateAcademiaValido(){
        
        a.setBairro("Novo Milenio");
        a.setCep("64685-000");
        a.setCidade("Marcolandia");
        a.setNomeAcademia("Academia Marcola");
        a.setNumero(279);
        a.setRua("Av. Corintio Matos");
        a.setEstado("PI");
        a.setIdacademia(3);
        
        assertTrue("Deveria Passar", up.dadosUpdateAcademia(a));
    }
    
    @Test
    public void testUpdateAcademiaEmBranco(){
        
        a.setBairro("");
        a.setCep("");
        a.setCidade("");
        a.setNomeAcademia("");
        a.setNumero(279);
        a.setRua("");
        a.setEstado("");
        
        assertFalse("Não Deveria Passar", up.dadosUpdateAcademia(a));
    }
    
        @Test
        public void testUpdateAcademiaBairroEmBranco(){
        
        a.setBairro("");
        a.setCep("64308-000");
        a.setCidade("Picos");
        a.setNomeAcademia("Aleluia");
        a.setNumero(279);
        a.setRua("Rua projetada de abrel");
        a.setEstado("Piauí");
        
        assertFalse("Não Deveria Passar", up.dadosUpdateAcademia(a));
    }
        
        @Test
        public void testUpdateAcademiaCEPEmBranco(){
        
        a.setBairro("Canto da Varzea");
        a.setCep("");
        a.setCidade("Picos");
        a.setNomeAcademia("Vem Ser Feliz");
        a.setNumero(279);
        a.setRua("Rua Eulino de Cajamar");
        a.setEstado("Piauí");
        
        assertFalse("Não Deveria Passar", up.dadosUpdateAcademia(a));
    }
    
        @Test
        public void testUpdateAcademiaCidadeEmBranco(){
        
        a.setBairro("Só os fortes");
        a.setCep("64308-000");
        a.setCidade("");
        a.setNomeAcademia("Ops");
        a.setNumero(279);
        a.setRua("Rua é flamengo");
        a.setEstado("São Paulo");
        
        assertFalse("Não Deveria Passar", up.dadosUpdateAcademia(a));
    }
        
        @Test
        public void testUpdateAcademiaAcademiaEmBranco(){
        
        a.setBairro("Novo Horizonte");
        a.setCep("64308-000");
        a.setCidade("Lagoa do Sítio");
        a.setNomeAcademia("");
        a.setNumero(279);
        a.setRua("Rua vasco");
        a.setEstado("Piauí");
        
        assertFalse("Não Deveria Passar", up.dadosUpdateAcademia(a));
    }
        
    @Test
    public void testUpdateNumeroEmBranco(){
        
        a.setBairro("Esperantina");
        a.setCep("64308-000");
        a.setCidade("Marcolândia");
        a.setNomeAcademia("Os Fortes");
        a.setNumero(-1);
        a.setRua("Rua vicente");
        a.setEstado("Piauí");
        
        assertFalse("Não Deveria Passar", up.dadosUpdateAcademia(a));
    }
    
    @Test
    public void testUpdateRuaEmBranco(){
        
        a.setBairro("Valentim");
        a.setCep("64308-000");
        a.setCidade("Valença");
        a.setNomeAcademia("Aiaiai");
        a.setNumero(279);
        a.setRua("");
        a.setEstado("Rio de Janeiro");
        
        assertFalse("Não Deveria Passar", up.dadosUpdateAcademia(a));
    }
    
    @Test
    public void testUpdateEstadoEmBranco(){
        
        a.setBairro("São Gonçalo");
        a.setCep("64308-000");
        a.setCidade("Caxias");
        a.setNomeAcademia("Só vem");
        a.setNumero(279);
        a.setRua("Rua encantada");
        a.setEstado("");
        
        assertFalse("Não Deveria Passar", up.dadosUpdateAcademia(a));
    }
    
    @Test
    public void testUpdateNomeAcademiaComNumero(){
        
        a.setBairro("São Gonçalo");
        a.setCep("64308-000");
        a.setCidade("Caxias");
        a.setNomeAcademia("Só vem 1");
        a.setNumero(279);
        a.setRua("Rua encantada");
        a.setEstado("Rio de Janeiro");
        
        assertFalse("Não Deveria Passar", up.dadosUpdateAcademia(a));
    }
    
    @Test
    public void testUpdateNomeCidadeAcademiaComNumero(){
        
        a.setBairro("São Gonçalo");
        a.setCep("64308-000");
        a.setCidade("Caxias1");
        a.setNomeAcademia("Só vem");
        a.setNumero(279);
        a.setRua("Rua encantada");
        a.setEstado("Rio de Janeiro");
        
        assertFalse("Não Deveria Passar", up.dadosUpdateAcademia(a));
    }
    
    @Test
    public void testUpdateNomeEstadoAcademiaComNumero(){
        
        a.setBairro("São Gonçalo");
        a.setCep("64308-000");
        a.setCidade("Caxias");
        a.setNomeAcademia("Só vem");
        a.setNumero(279);
        a.setRua("Rua encantada");
        a.setEstado("Rio de Janeiro1");
        
        assertFalse("Não Deveria Passar", up.dadosUpdateAcademia(a));
    }
    
    
}
