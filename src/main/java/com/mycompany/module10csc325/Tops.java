/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10csc325;

/**
 *
 * @author Owner
 */
public class Tops extends GarmentFamily{
    String style;
    String size;
    String color;

    public Tops(String style, String size, String color, String name, String description, String fabric) {
        super(name, description, fabric);
        this.style = style;
        this.size = size;
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getFabric() {
        return fabric;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tops{" + "style=" + style + ", size=" + size + ", color=" + color + '}';
    }
    
    
}
