package br.tests.FederacaoJudo;

import controle.ConnectionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author deusimar
 */
public class ConnectionFactoryTest {
    
    ConnectionFactory con;
    
        @Before
        public void setup() {
            con = new ConnectionFactory();
        }

        @After
        public void teardown() {
            con = null;
        }
        
        @Test
        public void testConnectionValida(){
            
        }
        
        @Test
        public void testConnectionInvalida(){
            
        }
        
}
