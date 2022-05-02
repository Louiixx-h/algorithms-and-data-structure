package br.com.luishenrique.datastructureandalgorithms.vetor;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import br.com.luishenrique.datastructureandalgorithms.search.LinearSearch;
import org.junit.Test;

public class LinearSearchTest {
    
    @Test
    public void checkIfStateExistsMethodShouldReturnTrueIfFindState() {
        LinearSearch linearSearch = new LinearSearch();
        assertTrue("O estado que você passou não existe", linearSearch.checkIfStateExists("DF"));
    }

    @Test
    public void checkIfStateExistsMethodShouldReturnFalseIfNotFindState() {
        LinearSearch linearSearch = new LinearSearch();
        assertFalse("O estado que você passou não existe", linearSearch.checkIfStateExists("RJ"));
    }
}
