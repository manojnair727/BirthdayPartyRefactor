package org.refactor.lendup.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.refactor.lendup.model.Balloon.BalloonBuilder;

public class BalloonTest {
    
    /**
     * Testing the builder.
     */
    @Test 
    public void testBuilder() {
        assertNotNull(Balloon.builder());
        assertTrue(Balloon.builder() instanceof BalloonBuilder);
    }
    
    /**
     * Testing the empty balloon.
     */
    @Test 
    public void testEmpty() {
        Balloon balloon = Balloon.builder().build();
        assertNull(balloon.getColor());
        assertNull(balloon.getMaterial());
        assertEquals(0, balloon.getNumber());
    }
    

    /**
     * Testing the addition of COLOR.
     */
    @Test 
    public void testAddColor() {
        Balloon balloon = Balloon.builder().color("blue").build();
        assertEquals("blue", balloon.getColor());
        assertNull(balloon.getMaterial());
        assertEquals(0, balloon.getNumber());
        
    }
    
    /**
     * Testing the addition of quantity.
     */
    @Test 
    public void testAddQuantity() {
        Balloon balloon = Balloon.builder().addQuantity(7).build();
        assertNull(balloon.getColor());
        assertNull(balloon.getMaterial());
        assertEquals(7, balloon.getNumber());
        
    }
    
    /**
     * Testing the setting of material.
     */
    @Test 
    public void testAddMaterial() {
        Balloon balloon = Balloon.builder().material("Latex").build();
        assertNull(balloon.getColor());
        assertEquals("Latex", balloon.getMaterial());
        assertEquals(0, balloon.getNumber());
        
    }
    
    /**
     * Testing giving multiple property to cake.
     */
    @Test 
    public void testMulti() {
        Balloon balloon = Balloon.builder().color("Green").material("Synthetic").build();
        assertEquals("Green", balloon.getColor());
        assertEquals("Synthetic", balloon.getMaterial());
        assertEquals(0, balloon.getNumber());
        
    }
    
    /**
     * Testing null entry to property.
     */
    @Test(expected=IllegalArgumentException.class) 
    public void testIllegal() {
        Balloon.builder().color("Blue").material(null).build();
        
    }
    
    /**
     * Testing the null value.
     */
    @Test(expected=IllegalArgumentException.class) 
    public void testIllegalSize() {
        Balloon.builder().color("Blue").addQuantity(0).build();
        
        
    }

}
