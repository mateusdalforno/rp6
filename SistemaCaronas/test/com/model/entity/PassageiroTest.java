/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model.entity;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juliano Macedo
 * @since 13/01/2013
 */
public class PassageiroTest {
    
    public PassageiroTest() {
    }

    /**
     * Test of hashCode method, of class Passageiro.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Passageiro instance = new Passageiro();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Passageiro.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Passageiro instance = new Passageiro();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Passageiro.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Passageiro instance = new Passageiro();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Passageiro.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Passageiro instance = new Passageiro();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Passageiro.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Passageiro instance = new Passageiro();
        instance.setId(id);
    }

    /**
     * Test of getNome method, of class Passageiro.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Passageiro instance = new Passageiro();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNome method, of class Passageiro.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Passageiro instance = new Passageiro();
        instance.setNome(nome);
    }

    /**
     * Test of getTelefone method, of class Passageiro.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        Passageiro instance = new Passageiro();
        String expResult = "";
        String result = instance.getTelefone();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelefone method, of class Passageiro.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String telefone = "";
        Passageiro instance = new Passageiro();
        instance.setTelefone(telefone);
    }

    /**
     * Test of getRg method, of class Passageiro.
     */
    @Test
    public void testGetRg() {
        System.out.println("getRg");
        Passageiro instance = new Passageiro();
        String expResult = "";
        String result = instance.getRg();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRg method, of class Passageiro.
     */
    @Test
    public void testSetRg() {
        System.out.println("setRg");
        String rg = "";
        Passageiro instance = new Passageiro();
        instance.setRg(rg);
    }
}
