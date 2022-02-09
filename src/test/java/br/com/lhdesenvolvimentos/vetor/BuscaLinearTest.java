package br.com.lhdesenvolvimentos.vetor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BuscaLinearTest {
    
    @Test
    public void checkIfStateExistsMethodShouldReturnTrueIfFindState() {
        BuscaLinear buscaLinear = new BuscaLinear();
        assertTrue("O estado que você passou não existe", buscaLinear.checkIfStateExists("DF"));
    }

    @Test
    public void checkIfStateExistsMethodShouldReturnFalseIfNotFindState() {
        BuscaLinear buscaLinear = new BuscaLinear();
        assertFalse("O estado que você passou não existe", buscaLinear.checkIfStateExists("RJ"));
    }
}
