/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juliano Macedo
 * @since 13/01/2013
 */
public class TipoVeiculoConverterTest {
    
    public TipoVeiculoConverterTest() {
    }

    /**
     * Test of getAsObject method, of class TipoVeiculoConverter.
     */
    @Test
    public void testGetAsObject() {
        System.out.println("getAsObject");
        FacesContext context = null;
        UIComponent component = null;
        String value = "";
        TipoVeiculoConverter instance = new TipoVeiculoConverter();
        Object expResult = null;
        Object result = instance.getAsObject(context, component, value);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAsString method, of class TipoVeiculoConverter.
     */
    @Test
    public void testGetAsString() {
        System.out.println("getAsString");
        FacesContext context = null;
        UIComponent component = null;
        Object value = null;
        TipoVeiculoConverter instance = new TipoVeiculoConverter();
        String expResult = null;
        String result = instance.getAsString(context, component, value);
        assertEquals(expResult, result);
    }
}
