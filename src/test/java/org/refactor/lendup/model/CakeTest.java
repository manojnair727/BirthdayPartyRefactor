package org.refactor.lendup.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.refactor.lendup.model.Cake.CakeBuilder;
import org.refactor.lendup.model.Cake.Size;

public class CakeTest {
    
    /**
     * Testing the builder.
     */
    @Test 
    public void testBuilder() {
        assertTrue(Cake.builder() instanceof CakeBuilder);
        assertNotNull(Cake.builder());
        
    }

    /**
     * Testing the addition of empty cake.
     */
    @Test 
    public void testEmpty() {
        Cake cake = Cake.builder().build();
        assertNull(cake.getFlavor());
        assertNull(cake.getFrostingFlavor());
        assertNull(cake.getShape());
        assertNull(cake.getSize());
        assertNull(cake.getColor());
        
    }

    /**
     * Testing the addition of cake flavor.
     */
    @Test 
    public void testAddFlavor() {
        Cake cake = Cake.builder().addFlavor("chocolate").build();
        assertEquals("chocolate", cake.getFlavor());
        assertNull(cake.getFrostingFlavor());
        assertNull(cake.getShape());
        assertNull(cake.getSize());
        assertNull(cake.getColor());
        
    }
    
    /**
     * Testing the addition of frosting flavor.
     */
    @Test 
    public void testAddFrostingFlavor() {
        Cake cake = Cake.builder().addFrostingFlavor("chocolate").build();
        assertEquals("chocolate", cake.getFrostingFlavor());
        assertNull(cake.getFlavor());
        assertNull(cake.getShape());
        assertNull(cake.getSize());
        assertNull(cake.getColor());
        
    }
    
    /**
     * Testing the setting of color.
     */
    @Test 
    public void testAddColor() {
        Cake cake = Cake.builder().addColor("blue").build();
        assertEquals("blue", cake.getColor());
        assertNull(cake.getFrostingFlavor());
        assertNull(cake.getShape());
        assertNull(cake.getSize());
        assertNull(cake.getFlavor());
        
    }
    
    /**
     * Testing the size.
     */
    @Test 
    public void testSize() {
        Cake cake = Cake.builder().size(Size.large).build();
        assertEquals(Size.large, cake.getSize());
        assertNull(cake.getFrostingFlavor());
        assertNull(cake.getShape());
        assertNull(cake.getFlavor());
        assertNull(cake.getColor());
        
    }
    
    /**
     * Testing giving the shape to cake.
     */
    @Test 
    public void testShape() {
        Cake cake = Cake.builder().shape("Square").build();
        assertEquals("Square", cake.getShape());
        assertNull(cake.getFrostingFlavor());
        assertNull(cake.getFlavor());
        assertNull(cake.getSize());
        assertNull(cake.getColor());
        
    }
    
    /**
     * Testing giving multiple property to cake.
     */
    @Test 
    public void testMulti() {
        Cake cake = Cake.builder().addFlavor("Vanilla").shape("Circle").build();
        assertEquals("Vanilla", cake.getFlavor());
        assertNull(cake.getFrostingFlavor());
        assertEquals("Circle", cake.getShape());
        assertNull(cake.getSize());
        assertNull(cake.getColor());
        
    }
    
    /**
     * Testing null entry to property.
     */
    @Test(expected=IllegalArgumentException.class) 
    public void testIllegal() {
        Cake.builder().addFlavor("Vanilla").shape(null).build();
        
    }
    
    /**
     * Testing the null value.
     */
    @Test(expected=IllegalArgumentException.class) 
    public void testIllegalSize() {
        Cake.builder().size(null).shape("Square").build();
        
    }
}
