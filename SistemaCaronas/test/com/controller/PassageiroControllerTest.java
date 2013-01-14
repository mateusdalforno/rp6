/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.entity.Passageiro;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juliano Macedo
 * @since 13/01/2013
 */
public class PassageiroControllerTest {

    public PassageiroControllerTest() {
    }

    /**
     * Test of salvar method, of class PassageiroController.
     */
    @Test
    public void testSalvar() {
        System.out.println("salvar");
        PassageiroController instance = new PassageiroController();
        String expResult = "listar";
        String result = instance.salvar();
        assertEquals(expResult, result);
    }

    /**
     * Test of editar method, of class PassageiroController.
     */
    @Test
    public void testEditar() {
        System.out.println("editar");
        PassageiroController instance = new PassageiroController();
        String expResult = "formulario";
        String result = instance.editar();
        assertEquals(expResult, result);
    }

    /**
     * Test of deletar method, of class PassageiroController.
     */
    @Test
    public void testDeletar() {
        System.out.println("deletar");
        PassageiroController instance = new PassageiroController();
        String expResult = "listar";
        String result = instance.deletar();
        assertEquals(expResult, result);
    }

    /**
     * Test of listar method, of class PassageiroController.
     */
    @Test
    public void testListar() {
        System.out.println("listar");
        PassageiroController instance = new PassageiroController();
        instance.listar();
    }
}
