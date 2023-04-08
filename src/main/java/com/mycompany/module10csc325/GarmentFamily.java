package com.mycompany.module10csc325;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owner
 */
public class GarmentFamily {
    String name;
    String description;
    String fabric;

    /**
     * Creates A Garment Family
     * @param name
     * @param description
     * @param fabric 
     */
    public GarmentFamily(String name, String description, String fabric) {
        this.name = name;
        this.description = description;
        this.fabric = fabric;
    }

    //Getters For Name, Description, Fabric
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getFabric() {
        return fabric;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    
    
}
