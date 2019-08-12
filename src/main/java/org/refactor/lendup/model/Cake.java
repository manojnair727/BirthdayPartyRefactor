

package org.refactor.lendup.model;


import org.refactor.lendup.model.builder.ItemBuilder;


/**
 * Cake domain model
 * 
 * @author manoj
 */
public class Cake implements Item {

    private String flavor;
    private String frostingFlavor;
    private String shape;
    private Size size;
    private String color;

    public static enum Size {
        large, small, medium
    }

    /**
     * Provides the builder class that helps in creating cake.
     * 
     * @return builder for cake
     */
    public static CakeBuilder builder() {
        return new CakeBuilder();
    }

    /**
     * Builder for the cake.
     * 
     * @author manoj
     */
    public static class CakeBuilder extends ItemBuilder<Cake> {
        private Cake cake;

        private CakeBuilder() {
            cake = new Cake();
        }

        public CakeBuilder addFlavor(String flavor) {
            checkNull(flavor, "Flavor");
            cake.flavor = flavor;
            return this;
        }

        public CakeBuilder addFrostingFlavor(String frostingFlavor) {
            checkNull(frostingFlavor, "FrostingFlavor");
            cake.frostingFlavor = frostingFlavor;
            return this;
        }

        public CakeBuilder shape(String shape) {
            checkNull(shape, "Shape");
            cake.shape = shape;
            return this;
        }

        public CakeBuilder size(Size size) {
            checkNull(size, "Size");
            cake.size = size;
            return this;
        }

        public CakeBuilder addColor(String color) {
            checkNull(color, "Color");
            cake.color = color;
            return this;
        }

        @Override
        public Cake build() {
            return this.cake;
        }
    }

    /**
     * @return the flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * @param flavor the flavor to set
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     * @return the frostingFlavor
     */
    public String getFrostingFlavor() {
        return frostingFlavor;
    }

    /**
     * @param frostingFlavor the frostingFlavor to set
     */
    public void setFrostingFlavor(String frostingFlavor) {
        this.frostingFlavor = frostingFlavor;
    }

    /**
     * @return the shape
     */
    public String getShape() {
        return shape;
    }

    /**
     * @param shape the shape to set
     */
    public void setShape(String shape) {
        this.shape = shape;
    }

    /**
     * @return the size
     */
    public Size getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(Size size) {
        this.size = size;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s, %s", flavor, frostingFlavor, shape, size, color);
    }
}
