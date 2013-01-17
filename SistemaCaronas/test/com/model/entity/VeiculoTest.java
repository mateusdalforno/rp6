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
public class VeiculoTest {
    
    public VeiculoTest() {
    }

    /**
     * Test of getId method, of class Veiculo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Veiculo instance = new Veiculo();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Veiculo.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Veiculo instance = new Veiculo();
        instance.setId(id);
    }

    /**
     * Test of getPlaca method, of class Veiculo.
     */
    @Test
    public void testGetPlaca() {
        System.out.println("getPlaca");
        Veiculo instance = new Veiculo();
        String expResult = "";
        String result = instance.getPlaca();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlaca method, of class Veiculo.
     */
    @Test
    public void testSetPlaca() {
        System.out.println("setPlaca");
        String placa = "";
        Veiculo instance = new Veiculo();
        instance.setPlaca(placa);
    }

    /**
     * Test of getQuilometragem method, of class Veiculo.
     */
    @Test
    public void testGetQuilometragem() {
        System.out.println("getQuilometragem");
        Veiculo instance = new Veiculo();
        Float expResult = null;
        Float result = instance.getQuilometragem();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuilometragem method, of class Veiculo.
     */
    @Test
    public void testSetQuilometragem() {
        System.out.println("setQuilometragem");
        Float quilometragem = null;
        Veiculo instance = new Veiculo();
        instance.setQuilometragem(quilometragem);
    }

    /**
     * Test of getCapacidadePassageiro method, of class Veiculo.
     */
    @Test
    public void testGetCapacidadePassageiro() {
        System.out.println("getCapacidadePassageiro");
        Veiculo instance = new Veiculo();
        Integer expResult = null;
        Integer result = instance.getCapacidadePassageiro();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCapacidadePassageiro method, of class Veiculo.
     */
    @Test
    public void testSetCapacidadePassageiro() {
        System.out.println("setCapacidadePassageiro");
        Integer capacidadePassageiro = null;
        Veiculo instance = new Veiculo();
        instance.setCapacidadePassageiro(capacidadePassageiro);
    }

    /**
     * Test of getCor method, of class Veiculo.
     */
    @Test
    public void testGetCor() {
        System.out.println("getCor");
        Veiculo instance = new Veiculo();
        String expResult = "";
        String result = instance.getCor();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCor method, of class Veiculo.
     */
    @Test
    public void testSetCor() {
        System.out.println("setCor");
        String cor = "";
        Veiculo instance = new Veiculo();
        instance.setCor(cor);
    }

    /**
     * Test of getTipoVeiculo method, of class Veiculo.
     */
    @Test
    public void testGetTipoVeiculo() {
        System.out.println("getTipoVeiculo");
        Veiculo instance = new Veiculo();
        TipoVeiculo expResult = null;
        TipoVeiculo result = instance.getTipoVeiculo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipoVeiculo method, of class Veiculo.
     */
    @Test
    public void testSetTipoVeiculo() {
        System.out.println("setTipoVeiculo");
        TipoVeiculo tipoVeiculo = null;
        Veiculo instance = new Veiculo();
        instance.setTipoVeiculo(tipoVeiculo);
    }

    /**
     * Test of hashCode method, of class Veiculo.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Veiculo instance = new Veiculo();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Veiculo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Veiculo instance = new Veiculo();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Veiculo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Veiculo instance = new Veiculo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
