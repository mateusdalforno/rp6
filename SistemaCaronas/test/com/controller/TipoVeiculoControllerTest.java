/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.entity.TipoVeiculo;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juliano Macedo
 * @since 13/01/2013
 */
public class TipoVeiculoControllerTest {

    public TipoVeiculoControllerTest() {
    }

    /**
     * Test of listar method, of class TipoVeiculoController.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        TipoVeiculoController instance = new TipoVeiculoController();
        instance.listar();
    }

    /**
     * Test of getTipoVeiculo method, of class TipoVeiculoController.
     */
    @Test
    public void testGetTipoVeiculo() {
        System.out.println("getTipoVeiculo");
        TipoVeiculoController instance = new TipoVeiculoController();
        TipoVeiculo expResult = null;
        TipoVeiculo result = instance.getTipoVeiculo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipoVeiculo method, of class TipoVeiculoController.
     */
    @Test
    public void testSetTipoVeiculo() {
        System.out.println("setTipoVeiculo");
        TipoVeiculo tipoVeiculo = null;
        TipoVeiculoController instance = new TipoVeiculoController();
        instance.setTipoVeiculo(tipoVeiculo);
    }

    /**
     * Test of getTiposVeiculos method, of class TipoVeiculoController.
     */
    @Test
    public void testGetTiposVeiculos() {
        System.out.println("getTiposVeiculos");
        TipoVeiculoController instance = new TipoVeiculoController();
        List expResult = null;
        List result = instance.getTiposVeiculos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTiposVeiculos method, of class TipoVeiculoController.
     */
    @Test
    public void testSetTiposVeiculos() {
        System.out.println("setTiposVeiculos");
        List<TipoVeiculo> tiposVeiculos = null;
        TipoVeiculoController instance = new TipoVeiculoController();
        instance.setTiposVeiculos(tiposVeiculos);
    }
}
