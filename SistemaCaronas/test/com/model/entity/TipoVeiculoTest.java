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
public class TipoVeiculoTest {
    
    public TipoVeiculoTest() {
    }

    /**
     * Test of getId method, of class TipoVeiculo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        TipoVeiculo instance = new TipoVeiculo();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class TipoVeiculo.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        TipoVeiculo instance = new TipoVeiculo();
        instance.setId(id);
    }

    /**
     * Test of getTipoVeiculo method, of class TipoVeiculo.
     */
    @Test
    public void testGetTipoVeiculo() {
        System.out.println("getTipoVeiculo");
        TipoVeiculo instance = new TipoVeiculo();
        String expResult = "";
        String result = instance.getTipoVeiculo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipoVeiculo method, of class TipoVeiculo.
     */
    @Test
    public void testSetTipoVeiculo() {
        System.out.println("setTipoVeiculo");
        String tipoVeiculo = "";
        TipoVeiculo instance = new TipoVeiculo();
        instance.setTipoVeiculo(tipoVeiculo);
    }

    /**
     * Test of hashCode method, of class TipoVeiculo.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        TipoVeiculo instance = new TipoVeiculo();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class TipoVeiculo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        TipoVeiculo instance = new TipoVeiculo();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class TipoVeiculo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TipoVeiculo instance = new TipoVeiculo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
