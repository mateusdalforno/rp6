/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.entity.TipoVeiculo;
import com.model.entity.Veiculo;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juliano Macedo
 * @since 13/01/2013
 */
public class VeiculoControllerTest {

    public VeiculoControllerTest() {
    }

    /**
     * Test of salvar method, of class VeiculoController.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        VeiculoController instance = new VeiculoController();
        String expResult = "";
        String result = instance.salvar();
        assertEquals(expResult, result);
    }

    /**
     * Test of editar method, of class VeiculoController.
     */
    @Test
    public void testEditar() {
        System.out.println("editar");
        VeiculoController instance = new VeiculoController();
        String expResult = "";
        String result = instance.editar();
        assertEquals(expResult, result);
    }

    /**
     * Test of deletar method, of class VeiculoController.
     */
    @Test
    public void testDeletar() {
        System.out.println("deletar");
        VeiculoController instance = new VeiculoController();
        String expResult = "";
        String result = instance.deletar();
        assertEquals(expResult, result);
    }

    /**
     * Test of listar method, of class VeiculoController.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        VeiculoController instance = new VeiculoController();
        instance.listar();
    }

    /**
     * Test of getVeiculo method, of class VeiculoController.
     */
    @Test
    public void testGetVeiculo() {
        System.out.println("getVeiculo");
        VeiculoController instance = new VeiculoController();
        Veiculo expResult = null;
        Veiculo result = instance.getVeiculo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVeiculo method, of class VeiculoController.
     */
    @Test
    public void testSetVeiculo() {
        System.out.println("setVeiculo");
        Veiculo veiculo = null;
        VeiculoController instance = new VeiculoController();
        instance.setVeiculo(veiculo);
    }

    /**
     * Test of getVeiculos method, of class VeiculoController.
     */
    @Test
    public void testGetVeiculos() {
        System.out.println("getVeiculos");
        VeiculoController instance = new VeiculoController();
        List expResult = null;
        List result = instance.getVeiculos();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVeiculos method, of class VeiculoController.
     */
    @Test
    public void testSetVeiculos() {
        System.out.println("setVeiculos");
        List<Veiculo> veiculos = null;
        VeiculoController instance = new VeiculoController();
        instance.setVeiculos(veiculos);
    }

    /**
     * Test of getId method, of class VeiculoController.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        VeiculoController instance = new VeiculoController();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class VeiculoController.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        VeiculoController instance = new VeiculoController();
        instance.setId(id);
    }

    /**
     * Test of getTipoVeiculoSelect method, of class VeiculoController.
     */
    @Test
    public void testGetTipoVeiculoSelect() {
        System.out.println("getTipoVeiculoSelect");
        VeiculoController instance = new VeiculoController();
        TipoVeiculo expResult = null;
        TipoVeiculo result = instance.getTipoVeiculoSelect();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipoVeiculoSelect method, of class VeiculoController.
     */
    @Test
    public void testSetTipoVeiculoSelect() {
        System.out.println("setTipoVeiculoSelect");
        TipoVeiculo tipoVeiculoSelect = null;
        VeiculoController instance = new VeiculoController();
        instance.setTipoVeiculoSelect(tipoVeiculoSelect);
    }
}
