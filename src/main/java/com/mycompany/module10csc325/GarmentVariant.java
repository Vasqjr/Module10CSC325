/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10csc325;

/**
 *
 * @author Owner
 */
public class GarmentVariant {
    String name;
    String description;
    Tops tops;
    Pants pants;
    Shoes shoes;

    public GarmentVariant(String name, String description, Tops tops, Pants pants, Shoes shoes) {
        this.name = name;
        this.description = description;
        this.tops = tops;
        this.pants = pants;
        this.shoes = shoes;
    }
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Tops getTops() {
        return tops;
    }

    public Pants getPants() {
        return pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTops(Tops tops) {
        this.tops = tops;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public String toString() {
        return "GarmentVariant{" + "name=" + name + ", description=" + description + ", tops=" + tops + ", pants=" + pants + ", shoes=" + shoes + '}';
    }
    
    

    
    
    
}
