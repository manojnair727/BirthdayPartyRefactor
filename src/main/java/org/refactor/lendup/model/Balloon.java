package org.refactor.lendup.model;

import org.refactor.lendup.model.builder.ItemBuilder;

public class Balloon implements Item {
    
    private String color;
    private String material;
    private int number;
    
    public static BalloonBuilder builder() {
        return new BalloonBuilder();
    }

    public static class BalloonBuilder extends ItemBuilder<Balloon> {

        private Balloon balloon;

        private BalloonBuilder() {
            super();
            balloon = new Balloon();
        }

        public BalloonBuilder color(String color) {
            checkNull(color, "Color");
            balloon.color = color;
            return this;
        }

        public BalloonBuilder material(String material) {
            checkNull(material, "Material");
            balloon.material = material;
            return this;
        }

        public BalloonBuilder addQuantity(int number) {
            if (number < 1) {
                throw new IllegalArgumentException("Balloon number has to be atleast 1");
            }
            balloon.number = number;
            return this;
        }

        @Override
        public Balloon build() {
            return this.balloon;
        }
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

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        return String.format("%s, %s, %d",color, material, number);
    }
}
