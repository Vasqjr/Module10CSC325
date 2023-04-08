/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10csc325;

import java.util.Map;

/**
 *
 * @author Owner
 */
public class GarmentFactory {
    
    
    public Tops create_tops(String style, String size, String color, String name, String description, String fabric){
        Tops top = new Tops(style, size, color, name, description, fabric);
        
        return top;
    }
    
    public Shoes create_shoes(String style, String size, String color, String name, String description, String fabric){
        Shoes shoe = new Shoes(style, size, color, name, description, fabric);
        
        return shoe;
    }
    
    public Pants create_pants(String style, String size, String color, String name, String description, String fabric){
        Pants pants = new Pants(style, size, color, name, description, fabric);
        
        return pants;
    }
    
    public GarmentVariant create_variant(String name, String description, Tops tops, Pants pants, Shoes shoes){
        GarmentVariant variant = new GarmentVariant(name, description, tops, pants, shoes);
        
        return variant;
    }
}
