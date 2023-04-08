/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module10csc325;

/**
 *
 * @author Owner
 */
public class Module10CSC325 {

    public static void main(String[] args) {
        //Create Factory To Build Products
        GarmentFactory factory = new GarmentFactory();
        
        //Create Family For User
        GarmentFamily family = new GarmentFamily("Guess", "Top Of The Line Guess Brand Clothing", "Cotton");
        
        //Create Tops, Pants, Shoes Objects
        Tops tops1 = factory.create_tops("Blouse", "White", "S", family.getName(), family.getDescription(), family.getFabric());
        Tops tops2 = factory.create_tops("T-shirt", "Black", "M",family.getName(), family.getDescription(), family.getFabric());
        
        Pants pants1 = factory.create_pants("Jeans", "Blue", "M",family.getName(), family.getDescription(), family.getFabric());
        Pants pants2 = factory.create_pants("Slacks", "Gray", "L",family.getName(), family.getDescription(), family.getFabric());
        
        Shoes shoes1 = factory.create_shoes("Sneakers", "White", "8",family.getName(), family.getDescription(), family.getFabric());
        Shoes shoes2 = factory.create_shoes("Dress shoes", "Black", "10",family.getName(), family.getDescription(), family.getFabric());

        //Create A Variant That Holds All These Objects
        GarmentVariant variant1 = factory.create_variant("Casual", "Casual outfit", tops1, pants1, shoes1);
        GarmentVariant variant2 = factory.create_variant("Formal", "Formal outfit", tops2, pants2, shoes2);

        
        //Create Instances Of The GarmentFamily Objects with individual items.
        GarmentFamily tops = new GarmentFamily("Tops", "Shirts and blouses", "Cotton");

        GarmentFamily pants = new GarmentFamily("Pants", "Jeans and slacks","Denim and Cotton");
        
        GarmentFamily shoes = new GarmentFamily("Shoes", "Sneakers and dress shoes", "Leather");

        //Test the functionality of the classes.
        System.out.println("Variants Created:");
        System.out.println(variant1);
        System.out.println(variant2);
        
        System.out.println("Tops:");
        System.out.println(tops1);
        System.out.println(tops2);
        
        System.out.println("Tops:");
        System.out.println(tops1);
        System.out.println(tops2);
        
        System.out.println("Pants:");
        System.out.println(pants1);
        System.out.println(pants2);
        
        System.out.println("Shoes:");
        System.out.println(shoes1);
        System.out.println(shoes2);
        
        
        
    }
}
